package com.profile.main.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "cat")
public class Cat implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub

		System.out.println("Meow......");
	}

}
