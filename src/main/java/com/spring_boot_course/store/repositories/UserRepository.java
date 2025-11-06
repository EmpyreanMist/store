package com.spring_boot_course.store.repositories;

import com.spring_boot_course.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
