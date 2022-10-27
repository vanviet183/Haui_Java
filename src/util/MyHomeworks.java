package util;

import java.util.HashMap;
import java.util.Map;

public class MyHomeworks {

	/**
	 * The method is used to validate full name
	 * @param fullName
	 * @return
	 */
	public static String validateFullName(String fullName) {
		String strNew = fullName.replaceAll("[0-9]", "");
		strNew = MyStrings.validateString(strNew);
		strNew = strNew.toLowerCase();

		String[] strs = strNew.split(" ");
		strNew = "";
		for (String str : strs) {
			strNew += str.substring(0, 1).toUpperCase() + str.substring(1);
			strNew += " ";
		}
		return strNew.trim();
	}
	
	/**
	 * The method is used to count string in string
	 * @return
	 */
	public static Map<String, Integer> countStringInString(String str) {
		if(str.charAt(0) == '@') {
			str = str.substring(1);
		}
		String strNew = str.replaceAll("\\@+", "@");
		String[] strs = strNew.split("@");
		
		Map<String, Integer> map = new HashMap<>();
		for(String s : strs) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);				
			}
		}
		return map;
	}
	
	public static String changeSubstring(String str, String s) { 
		String strNew = str;
		if(strNew.contains(s)) {
			s = MyHomeworks.validateFullName(s);
			s = s.toUpperCase();
			return s;
		}
		return "Not found string: " + s;
	}
	
	public static Double percentEqualTwoString(String str1, String str2, boolean isIgnoseCase) {
		if(isIgnoseCase) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
		}
		
		if(str1.length() < str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		
		String result = "";
		for(int i = 0; i < str1.length(); i++) {
			if(i < str2.length()) {
				if(str1.charAt(i) == str2.charAt(i)) {
					result += Character.toString(str1.charAt(i));
				} 				
			} 
		}
		
		return (1.0 * result.length() / str1.length()) * 100;
	}
	
	public static void main(String[] args) {
		String fullName = "       NgUyEn 00   vA88n     viE555t       ";
//		String strFacebook = "@dcb@@@ghu@@abc@abc@@@ghu@omn@@min";
//		System.out.println(MyHomeworks.validateFullName(fullName));
//		System.out.println(countStringInString(strFacebook));
//		System.out.println(changeSubstring(fullName, "vA88n"));
		String str1 = "Nguyen Van Viet";
		String str2 = "nguyen van viet";
		System.out.println(percentEqualTwoString(str1, str2, true));
	}
}
