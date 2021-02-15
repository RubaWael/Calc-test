package cal;


public class Calculator {

	public Calculator() {

	}

	public int add(int a, int b) {
		return a + b;
	}
	
	public int Sub(int a, int b) {
		return a - b;
	}
	
	public int Mul(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a) / Double.valueOf(b);
		}
		
		return result;
	}
}
