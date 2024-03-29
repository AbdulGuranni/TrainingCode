package com.training.basic;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {50,40,20,10,30};
		int smallest = numbers[0];
		for(int i=0;i<numbers.length;i++) {
		     if(numbers[i]<smallest) {
		    	 smallest = numbers[i];
		     }
			}
		System.out.println(smallest);
		}

	}


