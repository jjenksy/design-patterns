package com.design.patterns.designpatterns.behavioral.visitor;

public interface AtvPartVisitor {
	public void visit(Oil oil);
	public void visit(Wheel wheel);
	public void visit(Fender fender);

	void visit(Order order);
}
