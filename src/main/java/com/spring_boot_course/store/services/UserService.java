package com.spring_boot_course.store.services;

import com.spring_boot_course.store.entities.Address;
import com.spring_boot_course.store.entities.User;
import com.spring_boot_course.store.repositories.*;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;
    private final AddressRepository addressRepository;
    private final ProductRepository productRepository;

    public UserService(UserRepository userRepository, ProfileRepository profileRepository, EntityManager entityManager, AddressRepository addressRepository, ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.userRepository = userRepository;
        this.profileRepository = profileRepository;
        this.entityManager = entityManager;
        this.addressRepository = addressRepository;
        this.productRepository = productRepository;
    }


    @Transactional
    public void manageProducts() {
        productRepository.deleteById(4L);
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

    @Transactional
    public void showRelatedEntityStates() {
        var profile = profileRepository.findById(2L).orElseThrow();
        System.out.println(profile.getUser().getEmail());
    }

    public void fetchAddress() {
        var address = addressRepository.findById(1L).orElseThrow();
    }

    public void persistRelated() {
        var profile = new User();
        profile.setName("Chris");
        profile.setEmail("mail@mail.com");
        profile.setPassword("password");

        var address = new Address();
        address.setStreet("street");
        address.setCity("city");
        address.setState("state");
        address.setZip("zip");

        profile.addAddress(address);

        userRepository.save(profile);
    }

    @Transactional
    public void deleteRelated() {
        var user = userRepository.findById(3L).orElseThrow();
        var address =  user.getAddresses().getFirst();
        user.removeAddress(address);
        userRepository.save(user);
    }
}
