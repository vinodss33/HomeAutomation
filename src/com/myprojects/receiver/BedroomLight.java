package com.myprojects.receiver;

public class BedroomLight extends Light {
	LightIntensityEnum intensity;


	@Override
	public void lightOn() {
		switch (getCurrentIntensity()) {
		case OFF:
			intensity=LightIntensityEnum.NORMAL;
		case NORMAL:
			intensity=LightIntensityEnum.SLEEPING;
		case READING:
			intensity=LightIntensityEnum.SLEEPING;
		case SLEEPING:
			intensity=LightIntensityEnum.OFF;
		}
		System.out.println("Bedroom Light has been turned to "+getCurrentIntensity()+" Mode!!!");
	}
	LightIntensityEnum getCurrentIntensity() {
		return intensity;
	}

	public void setIntensity(LightIntensityEnum intensity) {
		this.intensity = intensity;
	}
}
