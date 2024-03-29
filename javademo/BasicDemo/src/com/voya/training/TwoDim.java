package com.voya.training;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] [] marks = new int [3][2];
		System.out.println(marks[0][0]);
		System.out.println(marks.length);
		
		marks[0][0] = 90;
		marks[0][1] = 100;
		marks[1][0] = 98;
		marks[1][1]=88;
		marks[2][0]= 80;
		marks[2][1]=40;
		//marks[4]  = 90;
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.print(marks[i][j]+"  ");
			}
			System.out.println();
		}
		
		for(int[] one:marks) {
			for(int num:one) {
				System.out.print(num+"  ");
			}
			System.out.println();
		}

	}

}
