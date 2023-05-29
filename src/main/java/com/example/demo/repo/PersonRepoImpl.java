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
		Person p = personMap.get(personId);
		if (p == null) {
			return null;
		} else {
			return p;
		}
	}

	@Override
	public Person updatePersonById(int personId, Person person) {
		Person p = personMap.get(personId);
		if (p == null) {
			System.out.println("person not found with personId " + personId);
			return null;
		} else {
			p.setFirstName(person.getFirstName());
			p.setLastName(person.getLastName());
			p.setEmail(person.getEmail());

			return p;
		}
	}

}
