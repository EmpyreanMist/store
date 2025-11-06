package com.spring_boot_course.store.repositories;

import com.spring_boot_course.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}