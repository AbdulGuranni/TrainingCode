package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component("shaper")
public class Square implements IShape{

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		int square = x*x;
		
	}

}
