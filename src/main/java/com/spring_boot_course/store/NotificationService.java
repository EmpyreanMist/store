package com.spring_boot_course.store;

public interface NotificationService {
    void send(String message, String recipientEmail);
}
