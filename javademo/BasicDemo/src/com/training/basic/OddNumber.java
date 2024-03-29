package com.training.basic;
import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number%2!=0) {
			System.out.println("odd number");
		}
		sc.close();
	}

}
