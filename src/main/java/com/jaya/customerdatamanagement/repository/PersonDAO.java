package com.jaya.customerdatamanagement.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jaya.customerdatamanagement.entity.Person;

@Repository
public class PersonDAO {

	@Autowired
	private PersonRepository repository;
	
	public Person savePerson(Person person) {
		return repository.save(person);
	}
}
