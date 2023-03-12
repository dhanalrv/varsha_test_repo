package service;

import java.util.Random;

import employee.Employee;

public class CredentialService {
	
	private String password;
	private String email;
	
	Random random = new Random();
	
	public void generatePassword(Employee emp) {	
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String number = "0123456789";
		String specialChar = "!@#$%^&*()~_-|?";
		String pswd = "";
		pswd += lowerCase.charAt(random.nextInt(lowerCase.length()));
		pswd += lowerCase.charAt(random.nextInt(lowerCase.length()));
		pswd += upperCase.charAt(random.nextInt(upperCase.length()));
		pswd += upperCase.charAt(random.nextInt(upperCase.length()));
		pswd += number.charAt(random.nextInt(number.length()));
		pswd += number.charAt(random.nextInt(number.length()));
		pswd += specialChar.charAt(random.nextInt(specialChar.length()));
		pswd += specialChar.charAt(random.nextInt(specialChar.length()));
		password = pswd ;
		emp.setPassword(password);	
	}	
	public void generateEmailAddress(Employee emp, String department) {
		
		email = emp.getfirstName().toLowerCase()+ emp.getlastName().toLowerCase()+ "@" 
					+ department.substring(0, 4).toLowerCase() 
						+".greatlearning.in";		
		emp.setEmail(email);	
	}
	public void showCredentials(Employee emp) {		
		System.out.println("Dear "+ emp.getfirstName() + " your generated credentials are :");
		System.out.println("Email --> "+ emp.getEmail());
		System.out.println("Pass --> " + emp.getPassword());		
	}
}
