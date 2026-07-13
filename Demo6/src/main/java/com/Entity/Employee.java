package com.Entity;





public class Employee {
	
	int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}

	String name;
	double salary;
	
	Address add;

	public Employee(int id, String name, double salary, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}

	
	
	

}
