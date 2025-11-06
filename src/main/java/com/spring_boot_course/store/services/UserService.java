package com.spring_boot_course.store.services;

import com.spring_boot_course.store.entities.User;
import com.spring_boot_course.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;

    public UserService(UserRepository userRepository, EntityManager entityManager) {
        this.userRepository = userRepository;
        this.entityManager = entityManager;
    }


    @Transactional
    public void showEntityStates() {
        User user = new User();
        user.setName("Chris");
        user.setEmail("mail@mail.com");
        user.setPassword("password");


        if(entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }

        userRepository.save(user);

        if(entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }
    }
}
