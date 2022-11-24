package io;

import java.io.*;

public class MyFiles {

	public static void textOutputFile() throws IOException {
		
		// Khoi tao doi tuong file de ghi du lieu
		FileWriter outFileWriter = new FileWriter("data.txt");
		
		// Khoi tao doi tuong thuc thi ghi vao file
		PrintWriter out = new PrintWriter(outFileWriter);
		
		// Xuat du lieu vao file
		out.println(123456);
		out.println("HELLO WORLD");
		out.println(9999.9999);
		out.println(false);
		
		out.close(); // Dong doi tuong thuc thi
	}
	
public static void textInputFile() throws IOException {
		
		// Khoi tao doi tuong file de doc
		FileReader inFileReader = new FileReader("data.txt");
		
		// Chuyen du lieu vao bo dem doc
		BufferedReader in = new BufferedReader(inFileReader);
		
		// Khai bao cac bien tuong ung
		int tmpInt;
		String tmpStr;
		double tmpDouble;
		boolean tmpBoolean;
		
		tmpStr = in.readLine();
		tmpInt = Integer.parseInt(tmpStr);
		System.out.println(tmpInt);
		
		tmpStr = in.readLine();
		System.out.println(tmpStr);
		
		tmpStr = in.readLine();
		tmpDouble = Double.parseDouble(tmpStr);
		System.out.println(tmpDouble);
		
//		tmpBoolean = (new Boolean(tmpStr)).booleanValue();
		tmpStr = in.readLine();
		System.out.println(tmpStr);
		
		in.close(); 
	}
	
	public static void main(String[] args) {
		try {
			MyFiles.textOutputFile();
			MyFiles.textInputFile();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
