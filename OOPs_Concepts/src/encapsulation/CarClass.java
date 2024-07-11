package encapsulation;

public class CarClass {
	
	private String model;
	private int year;
	
	public CarClass(String model, int year) {
		this.model = model;
		this.year = year;
	}
	

	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

/* Need of constructor :=> Constructor are used to initialization of an object, so that object 
 * will be meaningful
 */

/*Link to visit: https://www.youtube.com/watch?v=9wZYkfnkW2c&list=LL&index=1 */

/* Constructor:  
 * Name of the constructor is as same as name of the class
 * What ever instance variable are there it can be passed as an argument to the constructor
 * 1st object creation by "new" keyword and then constructor work will come in picture
 * this => means current object
 * */
