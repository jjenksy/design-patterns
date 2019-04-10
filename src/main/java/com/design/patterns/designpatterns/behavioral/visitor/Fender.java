package com.design.patterns.designpatterns.behavioral.visitor;

public class Fender implements AtvPart{


	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Fender{}";
	}
}
