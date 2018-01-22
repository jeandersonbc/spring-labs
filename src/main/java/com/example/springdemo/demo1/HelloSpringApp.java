package com.example.springdemo.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// notice we didn't have to bother on creating and instantiating the
		// HappyFortuneService class.
		System.out.println(theCoach.getDailyFortune());

		// close app context
		context.close();
	}
}
