package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Person;

public interface PersonService {
	public Collection<Person> getAllPersons();

	public Person createPerson(Person person);

	public Person getPersonById(int personId);
}
