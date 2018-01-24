package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach propertyCoach1 = context.getBean("soccerCoach", Coach.class);
		Coach propertyCoach2 = context.getBean("soccerCoach", Coach.class);
		Coach singletonCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach singletonCoach2 = context.getBean("tennisCoach", Coach.class);

		System.out.format("Expected false (prototype scope in use): %s%n", propertyCoach1 == propertyCoach2);
		System.out.format("Expected true (singleton scope in use - default): %s%n", singletonCoach1 == singletonCoach2);

		context.close();
	}
}
