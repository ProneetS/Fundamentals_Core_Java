package arrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//Declaring Array
		int a[] = new int[5];
		
		//giving input to the array
		a[0] = 1;
		a[1] = 4;
		a[2] = 9;
		a[3] = 3;
		a[4] = 5;
		
		//printing out the value of array
		for(int i = 0; i < a.length; i++) {
			System.out.println("Array a["+i+"] : " + a[i]);
		}
		
		System.out.println("----------------------------");
		
		//another way of initializing an array
		int b[] = {9,1,4,6,7,2,7};
		
		//printing out the value
		for(int i = 0; i < b.length; i++) {
			System.out.println("Array b["+i+"] : " + b[i]);
		}

	}

}
