package com.example.springdemo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;
import com.example.springdemo.FortuneService;

// removed bean id to use the default one generated by the spring container
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	private String schoolName;

	// constructor autowiring
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService,
			@Value("${school.name}") String schoolName) {
		System.out.println("TennisCoach.TennisCoach()");
		this.fortuneService = fortuneService;
		this.schoolName = schoolName;
	}

	@Override
	public String getDailyWorkout() {
		return "1 Hour of Tennis practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Override
	public String getSchoolName() {
		return this.schoolName;
	}

	@PostConstruct
	public void someStartUpTask() {
		System.out.println("TennisCoach.someStartUpTask()");
	}

	@PreDestroy
	public void someCleanUpTask() {
		System.out.println("TennisCoach.someCleanUpTask()");
	}

}
