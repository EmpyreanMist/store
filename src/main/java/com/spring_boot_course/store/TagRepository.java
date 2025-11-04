package com.spring_boot_course.store;

import com.spring_boot_course.store.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
