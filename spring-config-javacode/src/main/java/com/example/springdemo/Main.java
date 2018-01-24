package com.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// AnnotationConfig and ClassPathXml inherit from AbstractApplicationContext
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}
}
