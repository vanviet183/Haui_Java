package io;

public class Student {

	private int stt;
	private String firstName;
	private String lastName;
	private int age;
	
	private static int count = 0;

	public Student() {
		count++;
		this.stt = count;
	}
	
	public Student(int stt, String firstName, String lastName, int age) {
		super();
		count++;
		this.stt = count;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "SinhVien [stt=" + stt + "Full Name= " + lastName + " " + firstName +", tuoi=" + age + "]";
	}
	
	public void output() {
		System.out.printf("%-3s%-5d%-15s"," ", stt, lastName + " "+ firstName);
	}
	
}
