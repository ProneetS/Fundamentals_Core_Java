package demo;

import interfaceDemo.InternationalRules_Interface;

public class AustralianTraffic_Interface implements InternationalRules_Interface{

	public static void main(String[] args) {
		
		InternationalRules_Interface ir = new AustralianTraffic_Interface();
		ir.greenGo();
		ir.redStop();
		ir.flashYellow();
		
		// ir.walkSign() we can't call this method as "ir" is specific to the methods of InternationalRules
		
		AustralianTraffic_Interface at = new AustralianTraffic_Interface();
		at.walkSign();
		
	}

	@Override
	public void greenGo() {
		
		System.out.println("When green, Go !");
		
	}

	@Override
	public void redStop() {
		
		System.out.println("When Red, Stop !");
		
	}

	@Override
	public void flashYellow() {
		
		System.out.println("When Flash Yellow, Start !");
		
	}
	
	public void walkSign() {
		
		System.out.println("When walk sign, look arround !");
	}

}
