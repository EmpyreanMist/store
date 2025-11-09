package com.spring_boot_course.store.repositories;

import com.spring_boot_course.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
