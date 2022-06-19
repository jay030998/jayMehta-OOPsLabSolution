package com.oopslabsolution.service;

import java.util.Random;

import com.oopslabsolution.model.Employee;

public class CredencialService {
		
	public char[] generatePassword() {
		int length=10;
		String alphaNumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"
                + "abcdefghijklmnopqrstuvxyz" + "@#$%&";
		Random random = new Random();
		
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			password[i]= alphaNumeric.charAt(random.nextInt(alphaNumeric.length()));
		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".greatlearning.com";
	}
	
	public void showCredentials(Employee e, String email, char[] p) {
		System.out.println("Dear "+ e.getFirstName().toLowerCase()+" your generated credentials are as follows");
		System.out.println("Email ----> "+email);
		System.out.println("Password ----> "+p);
	}
}