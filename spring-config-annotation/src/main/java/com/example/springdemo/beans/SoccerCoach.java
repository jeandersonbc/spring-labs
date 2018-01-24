package com.example.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;
import com.example.springdemo.FortuneService;

@Component
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "2 Hours of soccer practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
