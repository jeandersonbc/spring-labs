package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1. Load application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Access beans (using default bean id)
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach otherCoach = context.getBean("soccerCoach", Coach.class);

		// 3. Use beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println(otherCoach.getDailyWorkout());
		System.out.println(otherCoach.getDailyFortune());

		// 4. Close context
		context.close();

	}
}
