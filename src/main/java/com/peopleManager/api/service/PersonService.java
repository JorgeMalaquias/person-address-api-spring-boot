package com.peopleManager.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.peopleManager.api.DTO.PersonDTO;
import com.peopleManager.api.model.Person;
import com.peopleManager.api.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @GetMapping
    public List<Person> getAll() {

        return repository.findAll();
    }

    @PostMapping
    public void create(PersonDTO person) {
        System.out.println(person.birthDay());
        repository.save(new Person(person));
    }
}
