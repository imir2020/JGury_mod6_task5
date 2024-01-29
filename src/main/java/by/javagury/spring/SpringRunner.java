package by.javagury.spring;

import by.javagury.spring.config.ApplicationConfig;
import by.javagury.spring.config.ApplicationProdConfig;
import by.javagury.spring.database.repository.CompanyRepository;
import by.javagury.spring.database.repository.UserRepository;
import by.javagury.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

//        var userService = context.getBean("userService1",UserService.class);
//        System.out.println(userService.findById(3L));

        var userRepository = context.getBean("userRepoForTest",UserRepository.class);
        System.out.println(userRepository.findById(2L));

        context.close();
    }
}
