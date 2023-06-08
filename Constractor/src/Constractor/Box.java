package Constractor;

public class Box {
	int h;
	double w;
	
	public Box(int a, double b) {
		System.out.println("Box is created");
		
		this.h = a;
		this.w = b;
	}
	
	void info() {
		System.out.println("height :"+h  +" width :" +w);
	}

}
