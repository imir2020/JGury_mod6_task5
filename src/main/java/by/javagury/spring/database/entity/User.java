package by.javagury.spring.database.entity;

import lombok.*;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private Long id;
    private LocalDateTime localDateTime;
    private String firstname;
    private String lastname;
    private String role;
    private String username;
    private Long companyId;

//    public User(long id, LocalDateTime birth_date, String firstname, String lastname, String role, String username, long company_id) {
//    }
}
