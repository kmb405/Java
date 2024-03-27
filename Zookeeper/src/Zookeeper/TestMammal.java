package Zookeeper;

public class TestMammal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla ape = new Gorilla();
		Bat bat = new Bat();
		
		ape.throwSomething();
		ape.throwSomething();
		ape.throwSomething();
		
		ape.eatBananas();
		ape.eatBananas();
		
		ape.climb();
		
		System.out.println(ape.getEnergy());
		
		
		
		bat.fly();
		bat.fly();
		
		bat.eatHumans();
		bat.eatHumans();
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		bat.displayEnergy();
		
	}

}
