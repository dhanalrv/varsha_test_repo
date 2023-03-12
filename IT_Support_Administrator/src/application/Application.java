package application;

import java.util.Scanner;

import employee.Employee;
import service.CredentialService;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee("Harshit","Choudary");
		
		CredentialService cs = new CredentialService();
		
		System.out.println("Please enter the department from the following: \n "
				+ "1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
			
			case 1 :	cs.generateEmailAddress(emp, "Technical");
						cs.generatePassword(emp);
						cs.showCredentials(emp);
						break;
			
			case 2 :	cs.generateEmailAddress(emp, "Admin");
						cs.generatePassword(emp);
						cs.showCredentials(emp);
						break;
			
			case 3 :	cs.generateEmailAddress(emp, "Human Resources");
						cs.generatePassword(emp);
						cs.showCredentials(emp);
						break;
			
			case 4 : 	cs.generateEmailAddress(emp, "Legal");
						cs.generatePassword(emp);
						cs.showCredentials(emp);
						break;
			default : 	System.out.println("Invalid Option");
			
		}
		sc.close();
		
	}

}
