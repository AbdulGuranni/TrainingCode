package com.struts.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class HomeAction {
	@Action(value="empform", results= {
			@Result(name="success",location="/WEB-INF/content/empform.jsp")
	})
	
	public String empForm() {
		return "success";
	}

	

}
