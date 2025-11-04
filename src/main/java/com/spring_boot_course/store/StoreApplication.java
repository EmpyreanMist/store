package com.spring_boot_course.store;

import com.spring_boot_course.store.entities.Tag;
import com.spring_boot_course.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        User user = new User(
                "Christian",
                "test@test.com",
                "123"
        );

/*        Address address = new Address(
                "street",
                "city",
                "state",
                "zipcode"
        );*/

/*
        user.addAddress(address);
*/
        var tag = new Tag("tag1");

        user.addTag("tag1");
        System.out.println(tag);

    }
}
