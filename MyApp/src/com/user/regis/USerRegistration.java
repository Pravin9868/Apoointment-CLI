package com.user.regis;

import java.util.Scanner;

public class USerRegistration {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the User Name for the Registration:- ");
		  String un=sc.nextLine();
	      System.out.println("Enter the Password :-");
		  String pass= sc.nextLine();
		  //this is for User Authentication For Static Data. 
		  if(un.equals("Ans01hu01")&& pass.equals("Pravin@123")) {
			   System.out.println("Hii You are the Valid User.");
		  }
		  else {
			  System.out.println("You enter the Wrong Details ");
		  }
		 
	    
	}

}
