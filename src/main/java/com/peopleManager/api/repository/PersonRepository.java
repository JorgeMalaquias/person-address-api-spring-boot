package com.peopleManager.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peopleManager.api.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
