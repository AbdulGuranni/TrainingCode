package com.voya.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
	public int sum(int x,int y) {
		return x+y;
	}
	public int product(int x,int y) {
		return x*y;
	}
	
	public String greetMessage(String name) {
		return "Welcome "+name.toUpperCase();
	}
	
	public List<String> showCourses(List<String> courses){
		Collections.sort(courses);
		return courses;
	}

}
