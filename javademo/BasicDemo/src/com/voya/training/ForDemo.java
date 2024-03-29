package com.voya.training;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=10;i++) {
			int n = 2*i;
			System.out.println("2"+"*"+i+"="+n);
		}*/
		int x = 0;
	    while(x<10) {
	    	System.out.println(x);
	    	x++;
	    }
	    
	    do {
	    	System.out.println(x);
	    	x--;
	    }
	    while(x>0);

	}

}
