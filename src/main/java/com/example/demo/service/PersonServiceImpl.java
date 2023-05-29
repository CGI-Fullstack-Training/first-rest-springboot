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
	public Person updatePersonByName(String firstName, Person person) {
		return personRepository.updatePersonByName(firstName,person);
	}

	@Override
	public Person getPersonByName(String firstName) {
		return personRepository.getPersonByName(firstName);
	}

}
