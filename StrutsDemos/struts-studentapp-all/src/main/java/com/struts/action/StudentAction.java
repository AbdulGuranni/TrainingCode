package com.struts.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.struts.model.Student;

public class StudentAction {
	
	private Student student;
	
	private List<String> hobbies;
	
	
	
	public StudentAction() {
		super();
		hobbies =  Arrays.asList("sports","music","dance");
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public List<String> getHobbies() {
		return hobbies;
	}

	
	public void setHobbies(List<String> hobbies) {
		this.hobbies =hobbies;
	}
	
	

	

	public String showStudForm() {
		return "none";
	}
	
	public String execute() {
		if(student.getName().equals("Abdul"))
			return "success";
			else
				return "error";
	}
	
	

}
