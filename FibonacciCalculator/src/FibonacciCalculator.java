public class FibonacciCalculator {
	public static void main(String[] args) {
		FibonacciCalculator result = new FibonacciCalculator();
		
		System.out.println(result.recurseFib(3));
		System.out.println(result.iterateFib(3));
	}
	
	// Recursive solution
	public int recurseFib(int n) {
		if (n == 0) {
			return 0;			
		} else if (n == 1) {
			return 1;
		} else {
			return recurseFib(n-1) + recurseFib(n-2);
		}
	}
	
	// Iterative solution
	public int iterateFib(int n) {
		int f0 = 0;
		int f1 = 1;
		int f2 = 1;
		if (n == 0) {
			return f0;
		} else if (n == 1) {
			return f1;
		} else if (n ==2) {
			return f2;
		} else {
			for(int i = 2; i < n; i++) {
				f0 = f1;
				f1 = f2;
				f2 = f1 + f0;
			}			
		}
		return f2;
	}
}
