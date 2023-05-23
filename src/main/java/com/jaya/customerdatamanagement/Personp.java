package com.jaya.customerdatamanagement;

import org.springframework.beans.factory.annotation.Autowired;

public class Personp {

	@Autowired
	Vehicle v;
	
	public void goingToWork() {
		v.travel();
	}
}
