package com.design.patterns.designpatterns.behavioral.chainofresponsibility;

public class CEO extends Handler {
	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO rules them all");
	}
}
