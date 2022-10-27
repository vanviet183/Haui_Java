package exams;

import java.util.Scanner;

public class Example3 {

	public static double volumeCone(float r, float h) {
		return 1.0 / 3 * Math.PI * r * r * h;
	}

	public static double volumeCylinder(float r, float h) {
		return Math.PI * r * r * h;
	}
	
	public static long gt(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n * gt(n - 1);			
		}
	}
	
	public static double combination(int n, int k) {
		return gt(n) / (gt(k) * gt(n - k));
	}
	
	public static double permutation(int n, int k) {
		return gt(n) / gt(n - k);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		float r = (float) (Math.random() * 100);
//		float h = (float) (Math.random() * 100);
//
//		System.out.println("1. Tinh the tich hinh non.");
//		System.out.println("2. Tinh the tich hinh tru.");
//		System.out.print("Nhap lua chon: ");
//
//		int choose = sc.nextInt();
//		switch (choose) {
//		case 1:
//			System.out.println("The tich hinh non = " + volumeCone(r, h));
//			break;
//
//		case 2:
//			System.out.println("The tich hinh tru = " + volumeCylinder(r, h));
//			break;
//
//		default:
//			break;
//		}
		
		int n = (int) (Math.random() * 10);
		int k = (int) (Math.random() * 10);
		
		System.out.println("Chinh hop chap " + k + " cua " + n + " = " + permutation(n ,k));
		System.out.println("To hop chap " + k + " cua " + n + " = " + combination(n ,k));
	}

}
