package by.javagury.spring.service;

import by.javagury.spring.database.repository.CompanyRepository;
import by.javagury.spring.dto.CompanyDto;
import by.javagury.spring.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.Optional;


@RequiredArgsConstructor
@ToString
@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public Optional<CompanyDto> findById(Long id) {
        return companyRepository.findById(id).map(companyMapper::companyToDto);
    }
}
