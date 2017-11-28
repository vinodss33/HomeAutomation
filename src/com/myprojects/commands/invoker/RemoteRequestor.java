package com.myprojects.commands.invoker;

import java.rmi.Remote;

import com.myprojects.commands.Command;

/**
 * Request Object containig specific command which will be excuted on press of
 * specific button of remote
 * 
 * @author vins
 * 
 */
public class RemoteRequestor {
	Command[] onCommands;
	Command[] offCommands;

	/**
	 * Setting the command to particular On and Off command in give particular
	 * slot
	 * 
	 * @param slot
	 * @param onCommand
	 * @param offCommand
	 */
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;

	}

	/**
	 * Execute Oncommand on press of button
	 * 
	 * @param slot
	 */
	public void pushOncommands(int slot) {
		onCommands[slot].excute();
	}

	/**
	 * Execute OffCOmmand on press of button
	 * 
	 * @param slot
	 */
	public void pushOffCommands(int slot) {
		offCommands[slot].excute();
	}

	public Command[] getOffCommands() {
		return offCommands;
	}

	public void setOffCommands(Command[] offCommands) {
		this.offCommands = offCommands;
	}

	public Command[] getonCommands() {
		return onCommands;
	}

	public void setonCommands(Command[] onCommands) {
		this.onCommands = onCommands;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n---------Remote Control---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuilder.append("[slot " + i + "]"
					+ onCommands[i].getClass().getName() + " "
					+ offCommands[i].getClass().getName());
		}
		return stringBuilder.toString();
	}
}
