package com.voya.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.autowire");
		Performance performance = (Performance) context.getBean("performance",Performance.class);
		performance.playMusic("v", "Despaccito");
		performance.playMusic("g", "Despaccito");
		performance.playMusic("k", "Despaccito");

	}

}
