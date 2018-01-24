package com.example.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;
import com.example.springdemo.FortuneService;

@Component
public class SwimmingCoach implements Coach {

	// Spring uses reflection to resolve this dependency without relying on
	// constructor or setter/method injection
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Get prepared for swimming competition...";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
