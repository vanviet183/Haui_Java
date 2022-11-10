package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import objects.Person;

public class MyArrays {

	/**
	 * This method is used to generate random value of array
	 * 
	 * @param n
	 * @return
	 */
	public static int[] generateArray(int n) {
		int[] arrInt = new int[n];

		for (int i = 0; i < n; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}

		return arrInt;
	}

	public static int[][] generateArray(int rows, int cols) {
		int[][] arrInt = new int[rows][cols];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = generateArray(cols);
		}

		return arrInt;
	}

	public static void showArr(int[] arrInt) {
		for (int value : arrInt) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static Person[] generatePerson(int n) {
		Person[] list = new Person[n];

		// Danh sach ten
		String[] firstNames = { "Anh", "Binh", "Tuan", "Tuan Anh", "Minh", "Minh Anh", "Bao Anh", "Bao", "Han", "Hung",
				"Chau Anh", "Chau", "Linh", "Thuy", "Hong", "Viet", "Nam", "Huyen Anh", "Phu", "Trang", "Thang", "Son",
				"Huyen", "Quynh", "Thao", "Nhung" };

		// Danh sach ho
		String[] lastNames = { "Hoang", "Nguyen", "Le", "Phan", "Pham", "Vu", "Dao", "Doan", "Linh", "Luong", "Bui",
				"Quach", "Ho", "Tran", "Ly", "Ngo" };

		// Thuc hien sinh ngau nhien
		int index;
		for (int i = 0; i < n; i++) {
			// Khoi tao bo nho cho phan tu mang
			list[i] = new Person();

			// Sinh ten
			index = (int) (Math.random() * firstNames.length);
			list[i].setFirstName(firstNames[index]);

			// Sinh ho
			index = (int) (Math.random() * lastNames.length);
			list[i].setLastName(lastNames[index]);

			// Sinh tuoi
			index = 18 + (int) (Math.random() * 5);
			list[i].setAge((byte) index);
		}

		return list;
	}
	
	public static Person[] searchPersonsByName(Person[] list, String name) {
		int cnt = 0;
		for(Person person : list) {
			if(person.getFirstName().contains(name)) {
				cnt++;
			}
		}
		
		// Khoi tao mang ket qua
		Person[] personsResult = new Person[cnt];
		
		// ghi nhan ket qua
		cnt = 0;
		for(Person person : list) {
			if(person.getFirstName().contains(name)) {
				personsResult[cnt++] = person;
			}
		}
		
		return personsResult;
	}
	
	public static ArrayList<Person> searchPersonByName(Person[] list, String name) {
		
		ArrayList<Person> results = new ArrayList<>();
		for(Person person : list) {
			if(person.getFirstName().contains(name)) {
				results.add(person);
			}
		}
		
		return results;
	}

	public static void showArr(int[][] arrInt) {
		for (int[] row : arrInt) {
			MyArrays.showArr(row);
		}
	}
	
	public static void showPerson(Person[] list) {
		for(Person person : list) {
			System.out.println(person);
		}
	}
	
	public static void showPerson(ArrayList<Person> list) {
		list.forEach(item -> {
			System.out.println(item);
		});
	}

	public static int[] sortArray(int[] arrInt, boolean isINC) {
		// Xac dinh huong sap xep
		byte oriented = (byte) (isINC ? 1 : -1);

		int tmp;
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i] * oriented > arrInt[j] * oriented) {
					tmp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = tmp;
				}
			}
		}
		return arrInt;
	}

	public static int[][] sortArray(int[][] arrInt, boolean isINC) {
		// Bien mang hai chieu sang mang 1 chieu
		int rows = arrInt.length;
		int cols = arrInt[0].length;

		int[] temp = new int[rows * cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				temp[i * cols + j] = arrInt[i][j];
			}
		}

		// Sap xep
		temp = MyArrays.sortArray(temp, isINC);

		// Chuyen ve 2 chieu
		int row = 0, col = 0;
		for (int i = 0; i < temp.length; i++) {
			arrInt[row][col++] = temp[i];

			if (i > 0 && (i + 1) % cols == 0) {
				row++;
				col = 0;
			}
		}

		return arrInt;
	}

	public static int[] filterPrime(int[] arrInt, boolean isINC) {
		// Sap xep
		arrInt = MyArrays.sortArray(arrInt, isINC);

		// Tach nguyen to, khong nguyen to
		int[] temp1 = new int[arrInt.length];
		int[] temp2 = new int[arrInt.length];
		int t1 = 0, t2 = 0;

		for (int value : arrInt) {
			if (exams.Example2.isPrime(value)) {
				temp1[t1++] = value;
			} else {
				temp2[t2++] = value;
			}
		}

		// Ghep lai
		for (int i = t1; i < arrInt.length; i++) {
			temp1[i] = temp2[i - t1];
		}

		return null;
	}
	
	public static ArrayList<Person> sortedByAge(Person[] list, boolean isINC) {
		// Tao tap hop trung gian
		ArrayList<Person> tmp = new ArrayList<>();
		
		// Sao chep mang sang tap hop
		Collections.addAll(tmp, list);
		
		if(isINC) {
			Collections.sort(tmp);			
		} else {
			Collections.sort(tmp, Collections.reverseOrder());			
		}		
		// Tra ve ket qua
		return tmp;
	}
	
	public static ArrayList<Person> sortedByName(Person[] list, boolean isINC) {
		// Tao tap hop trung gian
		ArrayList<Person> tmp = new ArrayList<>();
		
		// Sao chep mang sang tap hop
		Collections.addAll(tmp, list);
		
		if(isINC) {
			Collections.sort(tmp, new sortByName());			
		} else {
			Collections.sort(tmp, new sortByName().reversed());			
		}		
		
		// Tra ve ket qua
		return tmp;
	}

	public static void main(String[] args) {
		// Generate array
//		int[][] arrInt = MyArrays.generateArray(5, 5);

		// Show array
//		MyArrays.showArr(arrInt);
//
		// Sort array
//		arrInt = MyArrays.filterPrime(arrInt, true);

//		MyArrays.showArr(arrInt);

		// Sap xep mang 2 chieu
//		arrInt = MyArrays.sortArray(arrInt, true);
//		MyArrays.showArr(arrInt);

		// Sinh ngau nhien Person
		Person[] persons = MyArrays.generatePerson(20);
//		MyArrays.showPerson(persons);
		
		// Search person by name
//		Person[] personsResult = MyArrays.searchPersonsByName(persons, "Anh");
		ArrayList<Person> results = MyArrays.sortedByName(persons, false);
		
		MyArrays.showPerson(results);
	}
}

class sortByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		String name1 = o1.getFirstName();
		String name2 = o2.getFirstName();
		
		// Bien xac nhan vi tri can cat name sau cung
		byte at = (byte)name1.lastIndexOf(" ");
		if(at != -1) {
			name1 = name1.substring(at + 1);
		}
		at = (byte)name2.lastIndexOf(" ");
		if(at != -1) {
			name2 = name2.substring(at + 1);
		}
		return name1.compareToIgnoreCase(name2);
	}
	
}

