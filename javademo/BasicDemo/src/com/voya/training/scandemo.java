package com.voya.training;
import java.util.Scanner;
public class scandemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("enter age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println(age);
		
		System.out.println("enter  department");
		String department = sc.nextLine();
		System.out.println(department);
	    sc.close();

	}

}
