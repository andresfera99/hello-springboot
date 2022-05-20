package com.example.hellospringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringbootApplication {
    private static final Logger log = LoggerFactory.getLogger(HelloSpringbootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootApplication.class, args);
    }

    @RequestMapping("/hello")
    String hello() {
        return "Hello world";
    }

    @RequestMapping("/goodbye")
    String bye() {
        return "Goodbye world";
    }
}
