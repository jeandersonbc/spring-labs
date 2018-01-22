package com.example.springdemo.demo1.beans;

import com.example.springdemo.demo1.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
