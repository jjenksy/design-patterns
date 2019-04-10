package com.design.patterns.designpatterns.behavioral.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {
	@Override
	public void visit(Oil oil) {
		System.out.println("Display oil");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Display wheel");
	}

	@Override
	public void visit(Fender fender) {
		System.out.println("Display fender");
	}

	@Override
	public void visit(Order order) {
		System.out.println("Display order");
	}
}
