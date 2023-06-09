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

	@Override
	public Person updatePersonByFirstName(String firstName, Person person) {
		Collection<Person> personsList = personMap.values();
		for (Person tempPerson : personsList) {
			if (tempPerson.getFirstName().equals(firstName)) {
				tempPerson.setFirstName(person.getFirstName());
				tempPerson.setLastName(person.getLastName());
				tempPerson.setEmail(person.getEmail());

				return tempPerson;

			}
		}
		return null;
	}

	@Override
	public Person getPersonByFirstName(String firstName) {

		Collection<Person> list = personMap.values();
		for (Person tempPerson : list) {
			if (tempPerson.getFirstName().equals(firstName)) {
				return tempPerson;
			}
		}
		return null;
	}

	@Override
	public Person getPersonByLastName(String lastName) {
		Collection<Person> list = personMap.values();
		for (Person tempPerson : list) {
			if (tempPerson.getLastName().equals(lastName)) {
				return tempPerson;
			}
		}
		return null;
	}

	@Override
	public Person updatePersonByLastName(String lastName, Person person) {
		Collection<Person> personsList = personMap.values();
		for (Person tempPerson : personsList) {
			if (tempPerson.getLastName().equals(lastName)) {
				tempPerson.setFirstName(person.getFirstName());
				tempPerson.setLastName(person.getLastName());
				tempPerson.setEmail(person.getEmail());

				return tempPerson;

			}
		}
		return null;
	}

	@Override
	public Person getPersonByEmail(String email) {
		Collection<Person> list = personMap.values();
		for (Person tempPerson : list) {
			if (tempPerson.getEmail().equals(email)) {
				return tempPerson;
			}
		}
		return null;
	}

	@Override
	public Person getPersonByEmail(String email, Person person) {
		Collection<Person> personsList = personMap.values();
		for (Person tempPerson : personsList) {
			if (tempPerson.getEmail().equals(email)) {
				tempPerson.setFirstName(person.getFirstName());
				tempPerson.setLastName(person.getLastName());
				tempPerson.setEmail(person.getEmail());

				return tempPerson;

			}
		}
		return null;
	}

	@Override
	public String deletePersonById(int id) {
		if(personMap.get(id) != null) {
		personMap.remove(id);
		return "person with Id"+id+" successfully delete ";
		
		}
		else {
			return null;
		}
		
	}

}
