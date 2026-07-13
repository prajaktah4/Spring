package com.Entity;

import org.springframework.stereotype.Component;


public class Address {
	int pin;
	String city;
	
	

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
	
	
	
	

}
