package com.voya.food;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.voya.autowire.Performance;

public class Customer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.food");
		Waiter waiter = (Waiter) context.getBean("waiter",Waiter.class);
		List<String> chinese = waiter.viewMenuCard("chinese");
		for(String food:chinese) {
			System.out.println(food);
		}
		List<String> indian = waiter.viewMenuCard("indian");
		for(String food:indian) {
			System.out.println(food);
		}
		List<String> italian = waiter.viewMenuCard("italian");
		for(String food:italian) {
			System.out.println(food);
		}
	}
}
