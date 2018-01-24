package com.example.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1. Load application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Access beans (using default bean id)
		List<Coach> coaches = new ArrayList<>();
		coaches.add(context.getBean("soccerCoach", Coach.class));
		coaches.add(context.getBean("swimmingCoach", Coach.class));
		coaches.add(context.getBean("tennisCoach", Coach.class));

		// 3. Use beans
		for (Coach theCoach : coaches) {
			System.out.println(">> Info...");
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			System.out.println(theCoach.getSchoolName());
		}
		// 4. Close context
		context.close();

	}
}
