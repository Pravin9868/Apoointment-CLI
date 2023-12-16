package com.user.regis;

import java.util.Scanner;


public class RegistrationForNew {

	static NewRegister nr=new NewRegister();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
	  try{
	      System.out.print(" Enter firstName => ");
          String firstName = sc.nextLine();
          nr.setFirstName(firstName);
          

          System.out.print(" Enter lastName => ");
          String lastName = sc.nextLine();
          nr.setLastName(lastName);

          System.out.print(" Enter userName => ");
          String userName = sc.nextLine();
          nr.setUserName(userName);

          System.out.print(" Enter password => ");
          String password = sc.nextLine();
          nr.setPassword(password);

          System.out.print(" Enter emailId => ");
          String emailId = sc.nextLine();
          nr.setEmailId(emailId);

          System.out.print(" Enter phoneNo => ");
          String  phoneNo = sc.nextLine();
          nr.setPhoneNo(phoneNo);

          System.out.println(nr.toString());
          
          
          
	  }catch(Exception ex) {
		  System.out.println(ex);
	   }	
	}
}
