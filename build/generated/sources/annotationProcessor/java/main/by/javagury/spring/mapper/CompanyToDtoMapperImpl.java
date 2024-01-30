package by.javagury.spring.mapper;

import by.javagury.spring.database.entity.Company;
import by.javagury.spring.dto.CompanyDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-30T22:19:27+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.2.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
public class CompanyToDtoMapperImpl implements CompanyToDtoMapper {

    @Override
    public CompanyDto fromCompanyToDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto.CompanyDtoBuilder companyDto = CompanyDto.builder();

        companyDto.id( company.getId() );
        companyDto.name( company.getName() );

        return companyDto.build();
    }
}
