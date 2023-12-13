package com.springboot.web.library.module1;

import com.springboot.web.library.commons.dtos.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1App {
    Person person;

    public static void main(String[] args) {
        SpringApplication.run(Module1App.class, args);
    }
}
