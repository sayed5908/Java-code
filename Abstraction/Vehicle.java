package abstraction;

public abstract class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle is created");
	}
	
	public abstract void move();
	public void cary() {
		System.out.println("All vehicle cary loads");
	}

}
