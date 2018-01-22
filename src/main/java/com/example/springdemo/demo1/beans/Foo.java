package com.example.springdemo.demo1.beans;

/**
 * Dummy class to demonstrate life-cycle and scope
 */
public class Foo {

	public Foo() {
		System.out.println("At default constructor");
	}

	public void startup() {
		System.out.println("At startup: loading some resources...");
	}

	public void cleanup() {
		System.out.println("At cleanup: closing loaded resources");
	}
}
