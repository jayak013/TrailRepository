package com.jaya.customerdatamanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaya.customerdatamanagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
}
