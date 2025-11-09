package com.spring_boot_course.store.repositories;

import com.spring_boot_course.store.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
