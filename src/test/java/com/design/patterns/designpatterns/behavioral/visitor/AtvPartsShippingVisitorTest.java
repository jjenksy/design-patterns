package com.design.patterns.designpatterns.behavioral.visitor;

import org.junit.Test;

public class AtvPartsShippingVisitorTest {


	@Test
	public void visitorPattern() {

		Order order = new Order();
		order.addParts(new Fender());
		order.addParts(new Oil());
		order.addParts(new Wheel());

		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());
	}
}