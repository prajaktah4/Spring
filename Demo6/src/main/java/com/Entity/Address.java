package com.Entity;

import org.springframework.stereotype.Component;


public class Address {
	int pin;
	String city;
	
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	
	
	
	
	
	
	

}
