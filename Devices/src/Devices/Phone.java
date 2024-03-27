package Devices;

public class Phone extends Device{

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void makeCall() {
		int battery = this.getBattery();
		this.setBattery( battery - 5);
		if (getBattery() <= 10) {
			System.out.println("Battery Critical");
		}
		System.out.println("You are making a call");
		System.out.printf("Remaining battery: %d%n", this.getStatus());
	}
	public void playGame() {
		int battery = this.getBattery();
		if (battery <= 25) {
			System.out.println("You do not have enough battery to play a game.");
		} else {
			this.setBattery( battery - 20);
			if (this.getBattery() <= 10) {
				System.out.println("Battery Critical");
			}
			System.out.println("You are playing a game");
			System.out.printf("Remaining battery: %d%n", this.getStatus());
		}
	}
	public void charge() {
		int battery = this.getBattery();
		this.setBattery( battery + 50);
		if (getBattery() <= 10) {
			System.out.println("Battery Critical");
		}
		System.out.println("You are charging");
		System.out.printf("Remaining battery: %d%n", this.getStatus());
	}
}
