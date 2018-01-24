package com.example.springdemo.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.example.springdemo.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] options = { "Hard work pays-off kid! You will see...",
				"Today, things are going to change for better!" };
		Random rand = new Random();
		return options[rand.nextInt(options.length)];
	}

}
