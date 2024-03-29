package com.training.basic;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numEle = sc.nextInt();
		int[] numbers = new int[numEle];
		int[] finalArray = new int[numEle];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
			finalArray[i] = numbers[i]  * numbers[i] ;
			
		}
		for(int number:finalArray) {
			System.out.println(number);
		}
		sc.close();
	}

}
