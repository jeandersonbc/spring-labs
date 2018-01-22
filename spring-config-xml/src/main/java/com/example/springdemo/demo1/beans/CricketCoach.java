package com.example.springdemo.demo1.beans;

import com.example.springdemo.demo1.Coach;
import com.example.springdemo.demo1.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return String.format("[Coach: %s, team: %s, email: %s]", getClass().getSimpleName(), this.team, this.email);
	}
}
