package com.design.patterns.designpatterns.behavioral.chainofresponsibility;

public class Director extends Handler {


	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Director approves conference");
		} else {
			successor.handleRequest(request);
		}
	}
}
