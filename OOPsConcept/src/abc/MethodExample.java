package abc;

public class MethodExample {

	// no passing parameter as well as no return type
	static void display() {
	System.out.println("This is display method");
	}
	
	static int findLargest(int x, int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	// passing parameter and no return value
	static void add (int x, int y) {
		int sum =x+y;
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		int result = findLargest(10, 50);
		System.out.println(result);
	}

}
