package com.example.springdemo.beans;

// IMPORTANT: JDK9 removed javax.annotation... If you are using Java 9, remember to add
// javax.annotation-api jar to the classpath!
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;
import com.example.springdemo.FortuneService;

@Component
@Scope("prototype")
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${school.name}")
	private String schoolName;

	@Override
	public String getDailyWorkout() {
		return "2 Hours of soccer practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getSchoolName() {
		return this.schoolName;
	}

	@PostConstruct
	public void someStartUpTask() {
		System.out.println("SoccerCoach.someStartUpTask()");
	}

	// This annotation is useless here because spring will not
	// handle automatically as this is a "property-scoped" bean
	@PreDestroy
	public void someCleanUpTaks() {
		System.out.println("SoccerCoach.someCleanUpTaks()");
	}
}
