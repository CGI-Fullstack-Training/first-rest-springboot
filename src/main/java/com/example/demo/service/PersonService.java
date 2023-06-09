package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Person;

public interface PersonService {
	public Collection<Person> getAllPersons();

	public Person createPerson(Person person);

	public Person getPersonById(int personId);

	public Person updatePersonById(int personId, Person person);

	public Person updatePersonByFirstName(String firstName, Person person);

	public Person getPersonByFirstName(String firstName);

	public Person getPersonByLastName(String lastName);

	public Person updatePersonByLastName(String lastName, Person person);

	public Person getPersonByEmail(String email);

	public Person updatePersonByEmail(String email, Person person);

	public String deletePersonById(int id);
}
