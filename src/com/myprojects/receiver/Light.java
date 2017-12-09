package com.myprojects.receiver;

/**
 * Class will be parent class for all light classes
 * 
 * @author vins
 *
 */
public abstract class Light {
	public abstract void lightOn();

	public void lightOff() {
		System.out.println(this.getClass().getName()+" are Turned Off");
	}
	
}
