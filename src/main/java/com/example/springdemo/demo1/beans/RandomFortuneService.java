package com.example.springdemo.demo1.beans;

import java.util.Random;

import com.example.springdemo.demo1.FortuneService;

public class RandomFortuneService implements FortuneService {

	private static final String[] FORTUNES = { "Hard work pays off!", "Keep it up!", "Just do it!" };
	private final Random RAND = new Random();

	@Override
	public String getFortune() {
		return FORTUNES[RAND.nextInt(FORTUNES.length)];
	}

}
