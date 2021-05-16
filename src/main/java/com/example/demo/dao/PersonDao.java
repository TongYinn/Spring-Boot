package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    //allows user to insert Person with id
    int insertPerson (UUID id, Person person);

    //allows user to insert Person without id and generates a random id
    default int insertPerson (Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
