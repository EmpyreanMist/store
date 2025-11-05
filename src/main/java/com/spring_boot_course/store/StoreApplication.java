package com.spring_boot_course.store;

import com.spring_boot_course.store.entities.Profile;
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

        Profile profile = new Profile();
        profile.setBio("bio");

        // connect both sides
        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
    }
}
