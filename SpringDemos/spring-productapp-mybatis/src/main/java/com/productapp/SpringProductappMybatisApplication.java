package com.productapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
//	@Autowired
//	private IProductService productService;
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stu
////		Product product = new Product(3,"Skin Care","Mamaearth",500,"Health Care");
////		productService.addProduct(product);
////		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter choice");
////		int choice = sc.nextInt();
////		switch(choice){
////		case 1: System.out.println("Enter details to update");
////				System.out.println("Enter productId");
////				int prodId = sc.nextInt();
////				System.out.println("Enter price");
////				double prodPrice = sc.nextDouble();
////				productService.updateProduct(prodId, prodPrice);
////				break;
////				
////		case 2: System.out.println("To find all product details");
////				System.out.println(productService.getAll());
////				break;
////				
////		case 3: System.out.println("Enter details to delete");
////				System.out.println("Enter productId");
////				int prodctId = sc.nextInt();
////				productService.deleteProduct(prodctId);
////				break;
////				
////		case 4: System.out.println("Enter the details to find by id");
////				System.out.println("Enter productId");
////				int findByProdId = sc.nextInt();
////				System.out.println(productService.getById(findByProdId));
////				break;
////		
////		
////		
////		
////			
////		}
		
	}


