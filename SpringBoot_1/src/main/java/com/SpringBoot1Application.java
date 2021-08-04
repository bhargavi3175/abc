package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBoot1Application.class, args);
		System.out.println("Welcome to SpringBoot");
		Coder c1= (Coder) ctx.getBean("coder");
		c1.setCid(1);
		c1.setCname("Roopa");
		c1.setTech("Java");
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
	}

}
