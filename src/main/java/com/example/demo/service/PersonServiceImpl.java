package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Collection<Person> getAllPersons() {

		return personRepository.getAllPersons();
	}

	@Override
	public Person createPerson(Person person) {
		return personRepository.createPerson(person);
	}

	@Override
	public Person getPersonById(int personId) {

		return personRepository.getPersonById(personId);
	}

	@Override
	public Person updatePersonById(int personId, Person person) {
		
	 return personRepository.updatePersonById(personId,person);
	}

	@Override
	public Person updatePersonByFirstName(String firstName, Person person) {
		return personRepository.updatePersonByFirstName(firstName,person);
	}

	@Override
	public Person getPersonByFirstName(String firstName) {
		return personRepository.getPersonByFirstName(firstName);
	}

	@Override
	public Person getPersonByLastName(String lastName) {
		return personRepository.getPersonByLastName(lastName);
	}

	@Override
	public Person updatePersonByLastName(String lastName, Person person) {
		return personRepository.updatePersonByLastName(lastName,person);
	}

	@Override
	public Person getPersonByEmail(String email) {
		return personRepository.getPersonByEmail(email);
	}

	@Override
	public Person updatePersonByEmail(String email, Person person) {
		return personRepository.getPersonByEmail(email,person);
	}

	@Override
	public String deletePersonById(int id) {
		return  personRepository.deletePersonById(id);
	}

}
