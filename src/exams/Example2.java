package exams;

public class Example2 {

	/**
	 * This method is used to check a value <b>is primary</b> <br>
	 * 
	 * <i>Update 22/09/2022</i>
	 * 
	 * @author VAN VIET
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n >= 2;
	}
	
	/**
	 * This method is used to get UCLN value from two parameters <br> 
	 * 
	 * <i>Update 22/09/2022</i>
	 * 
	 * @author VAN VIET
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getUCLN(int a, int b) {
		int ucln = - 1;
		if(a * b != 0) {
			while (a != b) {
				if(a > b) {
					a -= b; // a = a - b
				} else {
					b -= a; // b = b - a
				}							
			}
			ucln = a; // b
		}
		
		return ucln;
	}
	
	public static int getUCLN(int a, int b, int c) {
		return Example2.getUCLN(Example2.getUCLN(a, b), c);
	}
	
	
	/**
	 * This method is used to calculate equations <br>
	 * 
	 * <i>Update 29/9/2022</i>
	 * 
	 * @author VAN VIET
	 */
	public static void biEqua(int a, int b, int c, int d, int e, int f) {
		int D = a * e - b * d;
	    int Dx = c * e - b * f;
	    int Dy = a * f - c * d;

	    if(D == 0 && Dx == 0) {
	    	System.out.println("He phuong trinh co vo so nghiem");
	    } else if(D == 0 && Dx != 0) {
	    	System.out.println("He phuong trinh vo nghiem");
	    } else if(D != 0) {
	    	System.out.println("He phuong trinh co nghiem: ");
	    	System.out.println("x = " + (float)Dx / D);
	    	System.out.println("y = " + (float)Dy / D);
	    }
	}

	public static void main(String[] args) {

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		int d = (int) (Math.random() * 100);
		int e = (int) (Math.random() * 100);
		int f = (int) (Math.random() * 100);
		
		System.out.println("UCLN cua " + a + " va " + b + " la: " + Example2.getUCLN(a, b));
		System.out.println("Giai he phuong trinh: ");
		System.out.println(a + "x + " + b + "y = " + c);
		System.out.println(d + "x + " + e + "y = " + f);
		
		Example2.biEqua(a, b, c, d, e, f);	
		
	}
	

}
