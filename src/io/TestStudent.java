package io;

import java.io.*;
import java.io.IOException;
import java.util.*;

public class TestStudent implements Serializable {

	public static List<Student> generateStudent(int n) {
		List<Student> list = new ArrayList<>();
		String[] firstNames = { "Anh", "Anh Tuấn", "Tuấn Anh", "Minh Anh", "Bảo", "Vân", "Hân", "Vũ", "Hùng", "Hải Anh",
				"Châu", "Châu Anh", "Minh Châu", "Linh", "Thuý", "Hồng", "Việt", "Nam", "Khải", "Huyền Anh", "Huy Anh",
				"Hưng", "Trang", "Yến", "Yến Anh" };

		String[] lastNames = { "Hoàng", "Nguyễn", "Lê", "Phan", "Phạm", "Vũ", "Đào", "Đoàn", "Linh", "Lương", "Ngô",
				"Mạnh", "Đỗ" };

		int index;

		for (int i = 0; i < n; i++) {
			Student sv = new Student();
			index = (int) (Math.random() * firstNames.length);
			sv.setFirstName(firstNames[index]);
			index = (int) (Math.random() * lastNames.length);
			sv.setLastName(lastNames[index]);
			sv.setAge((18 + (int) (Math.random() * 6)));
			list.add(sv);
		}
		return list;
	}

	public static void printListStudent(List<Student> list) {
		for (Student sv : list) {
			sv.output();
			System.out.println();
		}

	}

	public static void textOutputFile(List<Student> list) throws IOException {
		try {
			FileWriter fileWriter = new FileWriter("DANHSACH.txt");
			PrintWriter out = new PrintWriter(fileWriter);
			out.println("\t\t\tDANH SACH LOP");
			out.printf("%-3s%-5s%-15s", "", "STT", "Ho Ten");
			out.println();
			for(int i = 0; i < list.size(); i++) {
				out.printf("%-3s%-5s%-15s", "",list.get(i).getStt(), list.get(i).getLastName() + " " + list.get(i).getFirstName());
				out.println();
			}
			out.printf("%-3s%-5s%-15s", "", "Tong so: ", list.size());
			out.println();
			out.close();

		}catch( IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void textInputFile() throws IOException {
		FileReader fileReader = new FileReader("DANHSACH.txt");

		BufferedReader in = new BufferedReader(fileReader);
		String tmpStr = in.readLine();
		while (tmpStr != null) {
			tmpStr = tmpStr.trim();
			while (tmpStr.indexOf("  ") != -1) {
				tmpStr = tmpStr.replace("  ", " ");
			}
			String[] tmpStr1 = tmpStr.split(" ");
			String stt = tmpStr1[0];
			String name = "";
			for (int i = 1; i < tmpStr1.length; i++)
				name = name + " " + tmpStr1[i];
			System.out.printf("%-3s%-5d%-15s", "", stt, name);
			System.out.println();
			tmpStr = in.readLine();
		}
		in.close();
	}

	public static void textInputFileSortByName(List<Student> list) throws IOException {
		FileWriter fileWriter = new FileWriter("SortByName.txt");
		Collections.sort(list, new SortByName());

		PrintWriter out = new PrintWriter(fileWriter);
		out.printf("%-5s%-10s%-20s%-10s", "", "STT", "Ho Ten", "Tuoi");
		out.println();
		for (int i = 0; i < list.size(); i++) {
			out.printf("%-5s%-10s%-20s%-10s", "", list.get(i).getStt(),
					list.get(i).getLastName() + " " + list.get(i).getFirstName(), list.get(i).getAge());
			out.println();
		}
		out.printf("%-5s%-5s%-15s", "", "Tong so: ", list.size());
		out.println();
		out.close();

	}

	public static void textInputFileSortByAge(List<Student> list) throws IOException {
		FileWriter fileWriter = new FileWriter("SortByAge.txt");
		Collections.sort(list, new SortByAge());

		PrintWriter out = new PrintWriter(fileWriter);
		out.printf("%-5s%-10s%-20s%-10s", "", "STT", "Ho Ten", "Tuoi");
		out.println();
		for (int i = 0; i < list.size(); i++) {
			out.printf("%-5s%-10s%-20s%-10s", "", list.get(i).getStt(),
					list.get(i).getLastName() + " " + list.get(i).getFirstName(), list.get(i).getAge());
			out.println();
		}
		out.printf("%-5s%-5s%-15s", "", "Tong so: ", list.size());
		out.println();
		out.close();

	}

	public static void main(String[] args) throws IOException {
		List<Student> list = generateStudent(70);
		printListStudent(list);
		
		TestStudent.textOutputFile(list);
		TestStudent.textInputFileSortByName(list);
		TestStudent.textInputFileSortByAge(list);
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
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

class SortByAge implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

}
