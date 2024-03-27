package Zookeeper;

public class Bat extends Mammal{
	private int energy;
	
	public Bat() {
		super();
		this.energy = 300;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void fly() {
		int energy = this.getEnergy();
		this.setEnergy(energy - 50);
		System.out.println("The bat is airbourne");
	}
	
	public void eatHumans() {
		int energy = this.getEnergy();
		this.setEnergy(energy + 25);
		System.out.println("Yummy Human");
	}
	
	public void attackTown() {
		int energy = this.getEnergy();
		this.setEnergy(energy - 100);
		System.out.println("Dead bodies everywhere");
	}
	
}
