package com.training.basic;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {32,56,26,33,72};
		int temp=0;
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {
				temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
			}
		}
		System.out.println(numbers[numbers.length-2]);
	}

}
