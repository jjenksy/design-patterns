package com.design.patterns.designpatterns.behavioral.command;

public class ToggleCommand implements Command {

	private Light light;
	public ToggleCommand(Light light) {
		this.light = light;

	}

	@Override
	public void execute() {
		light.toggle();
	}
}
