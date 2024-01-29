package by.javagury.spring.mapper;

import by.javagury.spring.database.entity.Company;
import by.javagury.spring.dto.CompanyDto;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;


@ToString
@NoArgsConstructor
@Component
public class CompanyMapper {

    public CompanyDto companyToDto(Company company) {
        return CompanyToDtoMapper.INSTANCE.fromCompanyToDto(company);
    }
}
