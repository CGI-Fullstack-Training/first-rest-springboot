package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;
	
	

	@Override
	public List<Person> getAllPersons() {
		
		return personRepository.getAllPersons();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return personRepository.createPerson(person);
	}

}
