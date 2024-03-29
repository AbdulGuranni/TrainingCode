package com.voya.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.setter");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle);
	}

}
