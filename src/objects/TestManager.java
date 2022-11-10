package objects;

public class TestManager {

	public static void main(String[] args) {
		Address address = new Address();
		
		// Khoi tao doi tuong sinh vien
		Person student = new Student("Viet", "Nguyen Van", (byte) 19, address, 2021_00_013, "Cong nghe thong tin");
		Person employee = new Employee("Viet", "Nguyen Van", address, (byte) 20, 5_000, "Dev");

		//--------------------------------------------------
		
		Manager sm = new StudentManager();
		Manager em = new EmployeeManager();

		System.out.println(sm.getInfo(student));
		System.out.println(em.getInfo(employee));
	}
}
