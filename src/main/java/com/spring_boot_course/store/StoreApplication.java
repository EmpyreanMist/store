package com.spring_boot_course.store;

import com.spring_boot_course.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var service = context.getBean(UserService.class);
        service.deleteRelated();

        //var repository = context.getBean(UserRepository.class);
        //var user = repository.findById(1L).orElseThrow(); // find a user by id 1, or thor exception
        //repository.findAll().forEach(u -> System.out.println(u.getName())); // Print all user names
        // repository.deleteById(1L); // Deletes a user from database by its id
/*      User user = new  User();
        user.setName("Chris");
        user.setEmail("mail@mail.com");
        user.setPassword("password"); // create user object with different values

        // Hibernate saves the user object into the user database through the UserRepository
        repository.save(user);*/
    }
}
