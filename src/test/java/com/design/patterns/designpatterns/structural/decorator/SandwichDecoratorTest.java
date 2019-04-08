package com.design.patterns.designpatterns.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SandwichDecoratorTest {


	@Test
	public void createSandwich() {

		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSanwich()));

		System.out.println(sandwich.make());
	}
}