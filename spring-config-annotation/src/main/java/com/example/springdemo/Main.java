package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.beans.SoccerCoach;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		context.getBean("tennisCoach", Coach.class);

		// Because this bean has "property" scope, we need to call the pre-destroy
		// method explicitly. Recall that spring only handles pre-destroy methods
		// automatically for beans with "singleton" scope.
		SoccerCoach coach = context.getBean("soccerCoach", SoccerCoach.class);
		coach.someCleanUpTaks();

		context.close();
	}
}
