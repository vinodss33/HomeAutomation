package com.myprojects.commands;

import com.myprojects.receiver.Door;

public class DoorCloseCommand implements Command {

	private Door door;

	public DoorCloseCommand(Door garageDoor) {
		this.door = garageDoor;
	}

	@Override
	public void excute() {
		door.closeDoor();
	}

}
