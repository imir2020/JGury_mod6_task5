package by.javagury.spring.database.repository;

import by.javagury.spring.database.entity.User;
import by.javagury.spring.database.utils.ConnectionManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;


@ToString
@NoArgsConstructor
@Setter
@Repository
public class UserRepository {

    private final static String FIND_BY_ID_SQL = """
            SELECT id, birth_date,firstname,lastname,role,username,company_id
            FROM users
            WHERE id= ?
            """;

    private User buildUser(ResultSet result) {
        try {
            return User.builder()
                    .id(result.getLong("id"))
                    .localDateTime(LocalDateTime.parse(result.getTimestamp("birth_date")
                            .toLocalDateTime().toString()))
                    .firstname(result.getString("firstname"))
                    .lastname(result.getString("lastname"))
                    .role(result.getString("role"))
                    .username(result.getString("username"))
                    .companyId(result.getLong("company_id"))
                    .build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<User> findById(Long id) {
        try (var connection = ConnectionManager.open();
             var statement = connection.prepareStatement(FIND_BY_ID_SQL)) {
            statement.setLong(1, id);
            var result = statement.executeQuery();
            User user = null;
            if (result.next()) {
                user = buildUser(result);
            }
            return Optional.ofNullable(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
