package com.spring_boot_course.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${email.host}")
    private String mailHost;

    @Value("${email.port}")
    private int mailPort;



    @Override
    public void send(String message,  String recipientEmail) {
        System.out.println("Sending email: " + message + " to " + recipientEmail);
        System.out.println("Mail host: " + mailHost);
        System.out.println("Mail port: " + mailPort);
    }
}
