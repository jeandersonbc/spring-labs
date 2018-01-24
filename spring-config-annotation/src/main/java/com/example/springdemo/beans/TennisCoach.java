package com.example.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;
import com.example.springdemo.FortuneService;

// removed bean id to use the default one generated by the spring container
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	// constructor autowiring
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "1 Hour of Tennis practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
