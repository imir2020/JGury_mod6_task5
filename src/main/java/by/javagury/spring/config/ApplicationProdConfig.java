package by.javagury.spring.config;


import by.javagury.spring.database.repository.CompanyRepository;
import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.mapper.CompanyMapper;
import by.javagury.spring.mapper.UserMapper;
import by.javagury.spring.service.CompanyService;
import by.javagury.spring.service.UserService;
import org.springframework.context.annotation.*;


//@Profile("prod")
@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "by.javagury.spring")
public class ApplicationProdConfig {

    @Bean("userService1")
    public UserService userService(){
        return new UserService(new UserRepository(), new UserMapper());
    }

    @Bean("userService1")
    public CompanyService companyService(){
        return new CompanyService(new CompanyRepository(),new CompanyMapper());
    }
}
