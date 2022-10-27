package exams;

public class Example1 {

	public static void main(String[] args) {

		// Sinh ngau nhien 1 gia tri nguyen trong pham vi [0, 100]
		int n = (int) (Math.random() * 100);

		// In thong tin n
		System.out.println("Gia tri cua n = " + n);

		// Bien xac nhan ket qua
		boolean flag = true;
		if (n < 2) {
			flag = false;
		} else {
			for (int i = 2; i <= (int) Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
		}

		// Thong bao ket qua
		if (flag) {
			System.out.println(n + " la so nguyen to.");
		} else {
			System.out.println(n + " ko la so nguyen to.");
		}

	}
}
