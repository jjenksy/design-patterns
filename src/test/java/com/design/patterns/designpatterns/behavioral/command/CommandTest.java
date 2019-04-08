package com.design.patterns.designpatterns.behavioral.command;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {


	@Test
	public void commandPattern() {

		Light bedroomLight = new Light();
		Light kitchenLight = new Light();

		Switch lightSwitch = new Switch();

		Command onCommand = new ToggleCommand(bedroomLight);
//
		lightSwitch.storeAndExecute(onCommand);

		List<Light> lights = new ArrayList<>();
		lights.add(bedroomLight);
		lights.add(kitchenLight);

		Command allLightsCommand = new AllLightsCommand(lights);

		lightSwitch.storeAndExecute(allLightsCommand);
	}
}