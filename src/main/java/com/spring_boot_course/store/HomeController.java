package com.spring_boot_course.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index(){
        System.out.println(appName);
        return "index.html";
    }
}



// This is the controller part of the MVC

// MODEL == DATA + LOGIC
// VIEW == IS WHAT IS SHOWN OR VIEWED
// CONTROLLER == PROCESS, CHANGE AND CALL CHANGES IN MODEL AND VIEW