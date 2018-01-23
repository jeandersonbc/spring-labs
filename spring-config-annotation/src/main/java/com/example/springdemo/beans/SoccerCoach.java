package com.example.springdemo.beans;

import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "2 Hours of soccer practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
