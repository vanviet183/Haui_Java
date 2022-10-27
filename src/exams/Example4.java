package exams;

public class Example4 {
	
	/**
	 * This is method used to get <b>fibonacci of n</b> <br>
	 * @param n
	 * @return
	 */
	public static long fibonacci(int n) {
		if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }	
	}
	
	public static void main(String[] args) {
		int n = (int) (Math.random() * 100);

		System.out.println("Fibonacci cua " + n + " = " + fibonacci(n));
	}

}
