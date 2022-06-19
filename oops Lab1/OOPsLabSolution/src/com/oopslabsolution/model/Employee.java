package com.oopslabsolution.model;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
