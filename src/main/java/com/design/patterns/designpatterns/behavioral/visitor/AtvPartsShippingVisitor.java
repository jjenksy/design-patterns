package com.design.patterns.designpatterns.behavioral.visitor;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
	@Override
	public void visit(Oil oil) {
		System.out.println(oil.toString());
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println(wheel.toString());

	}

	@Override
	public void visit(Fender fender) {
		System.out.println(fender.toString());

	}

	@Override
	public void visit(Order order) {
		System.out.println(order.toString());

	}
}
