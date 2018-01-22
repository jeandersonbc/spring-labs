package com.example.springdemo.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springdemo.demo1.beans.Foo;

public class LifecycleAndScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-scope-context.xml");

		Foo foo1 = context.getBean("fooSingleton", Foo.class);
		Foo foo2 = context.getBean("fooSingleton", Foo.class);

		Foo foo3 = context.getBean("fooPrototype", Foo.class);
		Foo foo4 = context.getBean("fooPrototype", Foo.class);

		System.out.println("-- Checking scope");
		System.out.format("Expected true (singleton scope): %s%n", foo1 == foo2);
		System.out.format("Expected false (prototype scope): %s%n", foo3 == foo4);

		context.close();
	}

}
