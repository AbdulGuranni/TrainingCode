package com.training.basic;
import java.util.Scanner;
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numEle = sc.nextInt();
		int[] numbers = new int[numEle];
		int sum =0;
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
			sum = sum+numbers[i];
		}
		System.out.println(sum);
		int avg = sum/numEle;
		System.out.println(avg);
		sc.close();
	}
}
