package com.peopleManager.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peopleManager.api.DTO.PersonDTO;
import com.peopleManager.api.model.Person;
import com.peopleManager.api.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> getAll() {

        return service.getAll();
    }

    @PostMapping
    public void create(@RequestBody PersonDTO person) {
        System.out.println(person.birthDay());
        service.create(person);
    }
}
