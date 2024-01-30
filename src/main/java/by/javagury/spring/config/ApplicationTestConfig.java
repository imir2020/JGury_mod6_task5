package by.javagury.spring.config;


import by.javagury.spring.database.repository.CompanyRepository;
import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.database.utils.ConnectionManager;
import org.springframework.context.annotation.*;


@Profile("test")
@Configuration
@PropertySource("classpath:app_test.properties")
@ComponentScan(basePackages = "by.javagury.spring")
public class ApplicationTestConfig {

    @Bean("userRepoForTest")
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean("companyRepoForTest")
    public CompanyRepository companyRepository() {
        return new CompanyRepository();
    }

}
