package util;

import java.util.*;

public class MyStrings {

	/**
	 * This method is used to count a char number in str string
	 * 
	 * @param str
	 * @param ch
	 * @param isIgnoreCase
	 * @return
	 */
	public static int countChar(String str, char ch, boolean isIgnoreCase) {
		int count = 0;

		// Neu bo qua kieu chu thuong
		if (isIgnoreCase) {
			str = str.toLowerCase();
			ch = Character.toLowerCase(ch);
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}

	public static String validateString(String str) {
		// Danh sach ky tu dac biet
		char[] chs = {
				'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(',
				')', '-', '_', '=', '+', '{', '}', '[', ']', ':', ';',
				'\'', '|', '\\', '\"', '/', '?', '0', '1', '2',						
				'3', '4', '5', '6', '7', '8', '9'
		};
			
		// Loai bo ky tu dac biet
		for(char ch : chs) {
			str = str.replace(ch, ' ');
		}
			
		// Loai bo dau cach thua
		str = str.trim();
		while(str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}
			
		// Chuan hoa danh dau cau
		str = str.replace(" . ", ". ");
		str = str.replace(" , ", ", ");
		return str;	
	}

	/**
	 * This method is used to count a word number in str string
	 * 
	 * @param str
	 * @return
	 */
	public static int countWords(String str) {

		// Chuan hoa
		str = MyStrings.validateString(str);
		
		return MyStrings.countChar(str, ' ', false) + 1;
	}
	
	// Tinh tan suat xuat hien cua ki tu co trong 1 chuoi
	public static ArrayList<String> frequencyChar(String str, boolean isIgnoreChar) {
		if(isIgnoreChar) {
			str = str.toLowerCase();
		}
		
		String chs = "";
		String strTemp = str.trim();
		
		char ch;
		
		for(int i = 0; i < strTemp.length(); i++) {
			ch = strTemp.charAt(i);
			
			if(ch != ' ') {
				chs += ch;
				strTemp = strTemp.replace(ch, ' ');
			}
		}
		
		ArrayList<String> freq = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < chs.length(); i++) {
			ch = chs.charAt(i);
			
			count = MyStrings.countChar(str, ch, isIgnoreChar);
			freq.add(ch + " - " + count);
		}
		
		return freq;
	}
	
	// An bot khi qua so luong tu
	public static String getWords(String str, int amount) {
		
		String strEdited = MyStrings.validateString(str);
		
		if(MyStrings.countWords(str) > amount) {
			int cnt = 0;
			int i;
			for(i = 0; i < strEdited.length(); i++) {
				if(strEdited.charAt(i) == ' ' && (++cnt >= amount)) {
					break;
				}
			}
			return strEdited.substring(0, i) + " ..."; 
		} 
		
		return strEdited;
	}

	
	public static void main(String[] args) {
		String str = "Hello Everyone, Today 12  I will    talk";
//		System.out.println("Co tat ca: " + MyStrings.countChar(str, 'e', true) + " ky tu e");
//		System.out.println("Co tat ca: " + MyStrings.countWords(str) + " tu trong chuoi");
//		System.out.println(frequencyChar(str, true));
		System.out.println(MyStrings.getWords(str, 6));
	}
}
