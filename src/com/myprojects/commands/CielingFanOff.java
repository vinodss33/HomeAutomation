package com.myprojects.commands;

import com.myprojects.receiver.CielingFan;

public class CielingFanOff implements Command {

	private CielingFan cielingFan;

/*	public CielingFanOff(CielingFan cielingFan) {
		this.cielingFan = cielingFan;
	}*/

	public CielingFan getCielingFan() {
		return cielingFan;
	}

	public void setCielingFan(CielingFan cielingFan) {
		this.cielingFan = cielingFan;
	}

	@Override
	public void excute() {
		cielingFan.cielingFanOff();
	}
}
