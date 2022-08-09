package com.globallogic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main( String[] args ) {
		ApplicationContext context=new ClassPathXmlApplicationContext("DataBeans.xml");

		Employee employee=(Employee)context.getBean("employeeAllArgsConstructor");
		System.out.println("Using Constructor Injection:");
		System.out.println(employee);
		System.out.println();
		Employee e=(Employee)context.getBean("employeeAllArgsSetter");
		System.out.println("Using Setter Injection:");
		System.out.println(e);
    }
}

