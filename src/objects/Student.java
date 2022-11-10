package objects;

public class Student extends Person {
	// Constants
	public static final int ID = 0;
	public static final String SPECIALLY = "NONE";

	// Student's properties
	private int id;
	private String specially;

	// Constructor method
	public Student() {

	}

	public Student(String firstName, String lastName, byte age, Address address, 
			int id, String specially) {
		super(firstName, lastName, address, age);
		this.id = id;
		this.specially = specially;
	}

	@Override
	public String toString() {
		return "Student ["+super.toString() + ", id=" + id + ", specially=" + specially + "]";
	}
	
	public static void main(String[] args) {
		// Khoi tao dia chi
		Address address = new Address();
		
		// Khoi tao doi tuong sinh vien
		Person student = new Student("Viet", "Nguyen Van", (byte) 19, address, 2021_00_013, "Cong nghe thong tin");
		System.out.println(student.toString());
	}

}
