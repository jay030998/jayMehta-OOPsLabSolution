package com.oopslabsolution.main;

import java.util.Scanner;

import com.oopslabsolution.model.Employee;
import com.oopslabsolution.service.CredencialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("jay","mehta");
		CredencialService cs = new CredencialService();
		String email;
		char[] password;
		
		Scanner sc =new Scanner(System.in);
		
		int d;
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		d=sc.nextInt();
		switch(d) {
		case 1:
			email=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "tech");
			password=cs.generatePassword();
			cs.showCredentials(e,email , password);
			break;
		case 2:
			email=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "admin");
			password=cs.generatePassword();
			cs.showCredentials(e,email , password);
			break;
		case 3:
			email=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "hr");
			password=cs.generatePassword();
			cs.showCredentials(e,email , password);
			break;
		case 4:
			email=cs.generateEmailAddress(e.getFirstName().toLowerCase(), e.getLastName().toLowerCase(), "legal");
			password=cs.generatePassword();
			cs.showCredentials(e,email , password);
			break;
		default:
			System.out.println("Enter valid department");
		}
		
	}
}

