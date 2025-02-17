package com.voya.training;

import com.voya.exception.InvalidNumberException;

public class StudentDetails {
	
	public int totalMarks(int marks1, int marks2, int marks3) throws InvalidNumberException {
	if(marks1>0 || marks2>0 || marks3>0)
			throw new InvalidNumberException("Number is negative");
	if(marks1>100 || marks2>100 || marks3>100)	
		throw new InvalidNumberException("Number is greater 100");
	
	return marks1+marks2+marks3;
}
}