package by.javagury.spring.database.entity;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Company {
    private Long id;
    private String name;

}
