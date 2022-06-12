package com.producer.controller;

import com.producer.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Alex", 25);
    }

}
