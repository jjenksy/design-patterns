package com.design.patterns.designpatterns.behavioral.visitor;

public class Wheel implements AtvPart {

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Wheel{}";
	}
}
