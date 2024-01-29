package by.javagury.spring.config;


import by.javagury.spring.database.repository.CompanyRepository;
import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.database.utils.PropertiesManager;
import by.javagury.spring.database.utils.PropertiesUtil;
import org.springframework.context.annotation.*;


@Profile("test")
@Configuration
@PropertySource("classpath:app_test.properties")
@ComponentScan(basePackages = "by.javagury.spring")
public class ApplicationTestConfig {

    @Bean("userRepoForTest")
    public UserRepository userRepository(){
        return new UserRepository();
    }

    @Bean("companyRepoForTest")
    public CompanyRepository companyRepository(){
        return new CompanyRepository();
    }
    @Bean
    public PropertiesManager propertiesManager(){
        return new PropertiesManager("apptest.properties");
    }

    @Bean
    public PropertiesUtil createInstance(){
        return PropertiesUtil.createInstance();
    }
}
