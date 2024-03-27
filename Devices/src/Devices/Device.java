package Devices;

public class Device {
	private int battery;

	public Device() {
		this.battery = 100;
	}
	
	
	public int getBattery() {
		return battery;
	}


	public void setBattery(int battery) {
		this.battery = battery;
	}


	public int getStatus() {
		return this.battery;
	}
	
	
}
