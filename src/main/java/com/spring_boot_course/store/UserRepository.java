package com.spring_boot_course.store;

public interface UserRepository {
    public void save(User user);
    User findByEmail(String email);
}
