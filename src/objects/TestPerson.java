package objects;

public class TestPerson {

	public static void main(String[] args) {
		// Khoi tao dia chi
		Address address = new Address();

		// Khoi tao doi tuong sinh vien
		Person student = new Student("Viet", "Nguyen Van", (byte) 19, address, 2021_00_013, "Cong nghe thong tin");
		Person employee = new Employee("Viet", "Nguyen Van", address, (byte) 20, 5_000, "Dev");

		System.out.println(student.toString());
		System.out.println(employee.toString());
	}
}
