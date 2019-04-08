package com.design.patterns.designpatterns.behavioral.command;

public class Light {

	private boolean isOn = false;

	public void toggle(){
		if(isOn){
			off();
			isOn = !isOn;
		} else {
			on();
			isOn = !isOn;
		}
	}
	private void on(){
		System.out.println("Light on");
	}

	private void off() {
		System.out.println("Light off");
	}

	public boolean isOn() {
		return isOn;
	}
}
