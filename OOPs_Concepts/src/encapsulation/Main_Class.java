package encapsulation;

public class Main_Class {

	public static void main(String[] args) {
		
		CarClass mycar = new CarClass("Toyota", 2018);
		System.out.println("current car model " + mycar.getModel());
		System.out.println("current car year " + mycar.getYear());
		

	}

}

