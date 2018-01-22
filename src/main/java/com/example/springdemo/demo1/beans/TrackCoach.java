package com.example.springdemo.demo1.beans;

import com.example.springdemo.demo1.Coach;
import com.example.springdemo.demo1.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
