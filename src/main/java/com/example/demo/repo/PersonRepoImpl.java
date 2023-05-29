package com.example.demo.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public class PersonRepoImpl implements PersonRepository {

	private Map<Integer, Person> personMap = null;
	{
		personMap = new HashMap<Integer, Person>();
	}

	@Override
	public Collection<Person> getAllPersons() {
		return personMap.values();
	}

	@Override
	public Person createPerson(Person person) {
		personMap.put(person.getPersonId(), person);
		return person;
	}

	@Override
	public Person getPersonById(int personId) {
		return personMap.get(personId);

	}

}
