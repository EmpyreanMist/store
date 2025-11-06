package com.spring_boot_course.store.repositories;

import com.spring_boot_course.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}