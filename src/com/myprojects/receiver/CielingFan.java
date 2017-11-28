package com.myprojects.receiver;

import com.myprojects.commands.FanSpeedEnum;

public class CielingFan {
	FanSpeedEnum speed;

	public CielingFan(FanSpeedEnum speed) {
		this.speed = speed;
	}

	public void cielingFanOn() {
		FanSpeedEnum curentSpeed = getCurrentSpeed();
		switch (curentSpeed) {
		case OFF:
			speed = FanSpeedEnum.SLOW;
			break;
		case SLOW:
			speed = FanSpeedEnum.MEDIUM;
			break;
		case MEDIUM:
			speed = FanSpeedEnum.HIGH;
			break;
		case HIGH:
			speed = FanSpeedEnum.SLOW;
		}
		System.out.println("fan is running at Speed " + getCurrentSpeed());
	}

	public void cielingFanOff() {
		speed = FanSpeedEnum.OFF;
		System.out.println("Fan is turned off");
	}

	public FanSpeedEnum getCurrentSpeed() {
		return speed;
	}
}
