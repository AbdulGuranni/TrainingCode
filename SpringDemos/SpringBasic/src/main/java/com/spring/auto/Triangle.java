package com.spring.auto;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{

	@Override
	public void area(int x, int y) {
		// TODO Auto-generated method stub
		int triangleArea =(int) (0.5*x*y);
		System.out.println(triangleArea);
	}
	

}
