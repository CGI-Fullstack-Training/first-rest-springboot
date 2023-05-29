package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<?> getPersonById(@PathVariable("personId") int personId) {
//		return ResponseEntity.ok().body(personService.getPersonById(personId));
		Person p=personService.getPersonById(personId);
		System.out.println(p);
		if(p==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("person with id: "+personId+" not found");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(p);
		}
	}
	
	@PutMapping("/updatePerson/{personId}")
	public ResponseEntity<?> updatePersonById(@PathVariable("personId") int personId, @RequestBody Person person){
		Person p =personService.updatePersonById(personId,person);
		if(p==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("person with personId "+personId+" not found");
			
		}
		return ResponseEntity.ok().body(p);
	}
}
