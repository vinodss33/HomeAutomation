package com.myprojects.commands;

import com.myprojects.receiver.Light;

public class LightCommandOn implements Command {

	Light light;

	public LightCommandOn(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.lightOn();
	}

}
