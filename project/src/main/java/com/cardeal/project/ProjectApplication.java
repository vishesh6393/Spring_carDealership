package com.cardeal.project;

import com.cardeal.project.Car.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
import java.util.Scanner;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		Scanner sc =new Scanner(System.in);
		System.out.println("hello welcome to Vishesh CarDealer website");

		System.out.println("please enter your username : ");
		String name =sc.nextLine();
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("please choose which car type you want \n1.NormalCars\n2.SportsCar\n3.Truck\n0.Exit");
		int choice=sc.nextInt();
		System.out.println("your choice is "+ choice);
		switch (choice){
			case 1-> {
				Car mycar=(Car)context.getBean("normalCars");
				mycar.setOwnerName(name);
				String info=mycar.getInfo();
				String ownern=mycar.getOwnerName();
				System.out.println(ownern+" choose "+info);

				break;
			}
			case 2->{
				Car sport=(Car) context.getBean("sportsCar");
				sport.setOwnerName(name);
				String info=sport.getInfo();
				String ownern=sport.getOwnerName();
				System.out.println(ownern+" owns "+info);
				break;
			}
			case 3->{
				Car mycar=(Car) context.getBean("truck");
				mycar.setOwnerName(name);
				String info=mycar.getInfo();
				String ownern=mycar.getOwnerName();
				System.out.println(ownern+" owns "+info);
				break;
			}
			case 0->{
				System.out.println("Exiting.....");
				break;
			}
		}



	}


}
