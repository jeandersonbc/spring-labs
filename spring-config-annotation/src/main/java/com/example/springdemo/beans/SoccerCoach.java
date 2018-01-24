package com.example.springdemo.beans;

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
}
