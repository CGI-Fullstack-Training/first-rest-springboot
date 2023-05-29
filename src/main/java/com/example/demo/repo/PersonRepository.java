package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonRepository {

	public List<Person> getAllPersons();

	public Person createPerson(Person person);

}
