package com.ty.hospital.hospitalappboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.hospital.hospitalappboot.dao.PersonDao;
import com.ty.hospital.hospitalappboot.dto.Person;
import com.ty.hospital.hospitalappboot.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping("/person")
	public Person savePerson(@RequestBody Person person) {

		return personService.savePerson(person);

	}
	@PutMapping("/person")
	public Person updatePerson(@RequestBody Person person,@RequestParam int id) {
		return personService.updatePerson(id, person);
	}
	@GetMapping("/person")
	public Person getPersonById(@RequestParam int id) {
		return personService.getPersonById(id);
		
	}
	@GetMapping("/allperson")
	public List<Person> getAllPerson(){
		return personService.getAllPerson();
				
	}
	
	@DeleteMapping("/person")
	public void deleteById(@RequestParam int id) {
		personService.deletePersonById(id);
	}
	

}
