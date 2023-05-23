package com.jaya.customerdatamanagement;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	@Override
	public void travel() {
		System.out.println("I am travelling by BIKE");
	}

}
