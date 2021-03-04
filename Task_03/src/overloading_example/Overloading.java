package overloading_example;

public class Overloading {
	public static int same (int x, int y) {
		return x+y;
	}
	public static int same (int x, int y, int z) {
		return x+y+z;
	}
	
	

	public static void main(String[] args) {
		System.out.println(same(1,2)); //will print out the number 3
		System.out.println(same(2,3,4)); //will print out the number 9
		// This will execute the method with appropriate amount of numbers that should be inputed

	}

}
