package com.jaya.customerdatamanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaya.customerdatamanagement.entity.Person;
import com.jaya.customerdatamanagement.repository.PersonDAO;

@Service
public class PersonService {

	@Autowired
	private PersonDAO dao;
	
	public Person savePerson(Person person) {
		return dao.savePerson(person);
	}
	
}
