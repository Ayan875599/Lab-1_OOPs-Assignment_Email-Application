package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;

public class CredentialServiceImplTest {

	public static void main(String[] args) {
		
//		testEmailAddressGeneration();
		
//		testPasswordGeneration();
		
		testDisplayCredentials();
		
	}
		
		static void testEmailAddressGeneration() {

	
	

	
		
		
			CredentialServiceImpl serviceImpl = 
					new CredentialServiceImpl();
				
			Employee ayan = new Employee("Ayan", "Paul", "technical");
			
			String emailAddress =
				serviceImpl.generateEmailAddress(ayan);
			
			System.out.println(emailAddress);		
		}
		
		static void testPasswordGeneration() {
			
			CredentialServiceImpl serviceImpl = 
					new CredentialServiceImpl();
			String password  = serviceImpl.generatePassword();
			System.out.println("Password ->" + password);
			
		}
		

		static void testDisplayCredentials() {
			
			CredentialServiceImpl serviceImpl = 
					new CredentialServiceImpl();
			Employee ayan = new Employee("Ayan", "Paul", "technical");
			
			serviceImpl.generateEmailAddress(ayan);
			String password = serviceImpl.generatePassword();
			ayan.setPassword(password);
			
			serviceImpl.displayCredentials(ayan);
		}
}

