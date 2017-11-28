package com.myprojects.commands;

import com.myprojects.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command {

	private GarageDoor garageDoor;

	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void excute() {
		garageDoor.close();
	}

}
