package com.myprojects.commands;

import com.myprojects.receiver.Light;

public class LightCommandOff implements Command {
	Light light;

	public LightCommandOff(Light light) {
		this.light = light;
	}

	@Override
	public void excute() {
		light.lightOff();
	}
}
