package com.example.springdemo.demo1.beans;

import com.example.springdemo.demo1.Coach;
import com.example.springdemo.demo1.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice 1hr";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
