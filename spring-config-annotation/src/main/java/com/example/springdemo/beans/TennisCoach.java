package com.example.springdemo.beans;

import org.springframework.stereotype.Component;

import com.example.springdemo.Coach;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "1 Hour of Tennis practice";
	}

}
