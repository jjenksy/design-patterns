package com.design.patterns.designpatterns.behavioral.chainofresponsibility;

import org.junit.Test;

import static org.junit.Assert.*;

public class HandlerTest {


	@Test
	public void createCORPattern() {

		Director jim = new Director();
		VP shemick = new VP();
		CEO bob = new CEO();
		jim.setSuccessor(shemick);
		shemick.setSuccessor(bob);

		Request request = new Request(RequestType.CONFERENCE, 500);
		jim.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 1000);

		jim.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 2000);
		jim.handleRequest(request);
	}
}