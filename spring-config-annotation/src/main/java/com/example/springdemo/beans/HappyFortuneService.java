package com.example.springdemo.beans;

import org.springframework.stereotype.Component;

import com.example.springdemo.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day! Yay!";
	}

}
