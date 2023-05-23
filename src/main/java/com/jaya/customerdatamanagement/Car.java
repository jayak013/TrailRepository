package com.jaya.customerdatamanagement;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car")
public class Car implements Vehicle{

	Car car;
	
	@Override
	public void travel() {
		System.out.println("I am travelling by CAR");
	}

}
