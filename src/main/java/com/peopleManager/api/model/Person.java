package com.peopleManager.api.model;

import java.util.Date;

import com.peopleManager.api.DTO.PersonDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Person {

    public Person(PersonDTO data) {
        this.name = data.name();
        this.birthDay = data.birthDay();
        this.address = data.address();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(length = 50, nullable = false)
    public String name;

    @Column(nullable = false)
    public Date birthDay;

    @Column(nullable = false)
    public String address;

}
