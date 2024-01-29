package by.javagury.spring.config;

import org.springframework.context.annotation.*;

@Import({ApplicationTestConfig.class,ApplicationProdConfig.class})
@Configuration
@ComponentScan(basePackages = "by.javagury.spring")
public class ApplicationConfig {

}
