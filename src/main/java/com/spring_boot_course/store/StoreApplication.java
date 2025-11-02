package com.spring_boot_course.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);


        var userService = context.getBean(UserService.class);
        User user = new User(
                1L,
                "Christianmail@com",
                "123",
                "Christian"
        );
        userService.registerUser(user);
    }
}
