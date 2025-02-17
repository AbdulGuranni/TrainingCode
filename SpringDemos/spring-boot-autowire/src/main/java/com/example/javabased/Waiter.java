package com.example.javabased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Waiter {
	@Autowired
	//@Qualifier("chinese")
	@Qualifier("getIndian")
	IFoodMenu menu;
	
	@Autowired
	//@Qualifier("indian")
	IFoodMenu indian;
	
	@Autowired
	//@Qualifier("italian")
	IFoodMenu italian;
	
	public void setMenu(IFoodMenu menu) {
		this.menu = menu;
	}

	public List<String> viewMenuCard(String choice){
		List<String> menuList=new ArrayList<>();
		if(choice.equals("chinese"))
			menuList =menu.showMenu();
		if(choice.equals("indian"))
			menuList = indian.showMenu();
		if(choice.equals("italian"))
			menuList =italian.showMenu();
		
		return menuList;
	}

}
