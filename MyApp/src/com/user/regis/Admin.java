package com.user.regis;

public class Admin {

	public static String addUser(String firstName,String lastName,String userName,String password,String emailId,String phoneNo) {
	 String str= String.format("insert into registration(firstName,lastName,lastName,password,emailId,phoneNo)values('%s','%s','%s','%s','%s','%s');",firstName,lastName,lastName,password,emailId,phoneNo);}
     Statement st= 
}
