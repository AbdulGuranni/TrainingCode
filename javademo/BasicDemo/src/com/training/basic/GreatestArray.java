package com.training.basic;

public class GreatestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,60,20,50,40};
		int greatest = numbers[0];
		for(int i=0;i<numbers.length;i++) {
		     if(numbers[i]>greatest) {
		    	 greatest = numbers[i];
		     }
			}
		System.out.println(greatest);
		}
	}



