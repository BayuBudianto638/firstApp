package com.springbootfirst.shiawase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstAppApplication.class, args);
		
		System.out.println("First springboot");

		Employee emp = context.getBean(Employee.class);
		emp.Get();
	}

}
