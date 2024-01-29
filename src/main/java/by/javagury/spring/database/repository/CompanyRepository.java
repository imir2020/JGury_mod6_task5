package by.javagury.spring.database.repository;


import by.javagury.spring.database.entity.Company;
import by.javagury.spring.database.utils.ConnectionManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@NoArgsConstructor
@ToString
@Setter
@Repository
public class CompanyRepository {

    private final static String FIND_BY_ID_SQL = """
            SELECT id, name
            FROM company
            WHERE id= ?
            """;

    private Company buildCompany(ResultSet result) {
        try {
            return Company.builder()
                    .id(result.getLong("id"))
                    .name(result.getString("name"))
                    .build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<Company> findById(Long id) {
        try (var connection = ConnectionManager.open();
             var statement = connection.prepareStatement(FIND_BY_ID_SQL)) {
            statement.setLong(1, id);
            var result = statement.executeQuery();
            Company company = null;
            if (result.next()) {
                company = buildCompany(result);
            }
            return Optional.ofNullable(company);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
