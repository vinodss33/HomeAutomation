package com.myprojects.commands;

import com.myprojects.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void excute() {
		garageDoor.open();
	}
}
