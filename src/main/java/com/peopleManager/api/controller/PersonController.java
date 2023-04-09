package com.peopleManager.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peopleManager.api.DTO.PersonDTO;
import com.peopleManager.api.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping
    public String randomString() {
        return "some string";
    }

    @PostMapping
    public void create(@RequestBody PersonDTO person) {
        System.out.println(person.birthDay());
    }
}
