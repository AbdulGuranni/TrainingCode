package com.voya.training;
import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isPresent = false;
		String uname = sc.next();
		String[] usernames = new String[]{"Abdul","Ajay","Anil","Arvind"};
	    for(String username: usernames) {
	    	if(username.equalsIgnoreCase(uname)) {
	    		System.out.println("Name alredy exist");
	    		isPresent = true;
	    		break;
	    	}
	    }
	    if(!isPresent) {
	    	System.out.println("You are registered");
	    }

	}

}
