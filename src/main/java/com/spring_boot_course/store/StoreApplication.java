package com.spring_boot_course.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
/*        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);
        orderService.placeOrder();
        context.close();*/

        var userService = context.getBean(UserService.class);
        User user = new User(
                1l,
                "Christianmail@com",
                "123",
                "Christian"
        );
        userService.registerUser(user);
        userService.registerUser(user);
    }
}
