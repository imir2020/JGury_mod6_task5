package by.javagury.spring.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Value
@Builder
public class UserDto {
    Long id;
    LocalDateTime localDateTime;
    String firstname;
    String lastname;
    String role;
    Long companyId;
}
