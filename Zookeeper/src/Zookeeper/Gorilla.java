package Zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void throwSomething() {
		int energy = this.getEnergy();
		this.setEnergy(energy - 5);
		System.out.println("The gorilla threw poop");
	}
	
	public void eatBananas() {
		int energy = this.getEnergy();
		this.setEnergy(energy + 10);
		System.out.println("Yummy Naner");
	}
	
	public void climb() {
		int energy = this.getEnergy();
		this.setEnergy(energy - 10);
		System.out.println("The gorilla climbed a tree");
	}
	
}
