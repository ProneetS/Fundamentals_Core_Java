package demo;

import abstractionDemo.ParentAirCraft_Abstraction;

public class ChildAirIndia_Abstraction extends ParentAirCraft_Abstraction {

	public static void main(String[] args) {
		
		ChildAirIndia_Abstraction ab = new ChildAirIndia_Abstraction();
		ab.engine();
		ab.safety();
		ab.color();

	}

	@Override
	public void color() {
		
		System.out.println("Color of the plane is 'Red' ");
		
	}

}
