package by.javagury.spring.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CompanyDto {
    Long id;
    String name;
}
