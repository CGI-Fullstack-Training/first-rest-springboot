package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/persons")
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {
		Person p=personService.createPerson(person);
		return ResponseEntity.status(HttpStatus.CREATED).body(p);
	}
	
	@GetMapping("/persons")
	public ResponseEntity<Collection<Person>> getAllPersons() {
		return ResponseEntity.ok().body(personService.getAllPersons());
	}
	@GetMapping("/persons/{personId}")
	public ResponseEntity<Person> getPersonById(@PathVariable("personId") int personId) {
		return ResponseEntity.ok().body(personService.getPersonById(personId));
	}
}
