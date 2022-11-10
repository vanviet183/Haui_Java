package objects;

public class Employee extends Person {
	// Constants
	public static final int NET = 3;
	public static final String POSITION = "Director";
	
	// Employee's properties
	private int net;
	private String position;
	
	
	// Constructor methods
	public Employee() {
		this(Employee.FIRSTNAME, Employee.LASTNAME, Employee.ADDRESS, Employee.AGE, Employee.NET, Employee.POSITION);
	}
	public Employee(String firstName, String lastName, Address address, byte age,  
			int net, String position) {
		super(firstName, lastName, address, age);
		this.net = net;
		this.position = position;
	}
	
	public int getNet() {
		return net;
	}
	
	public void setNet(int net) {
		this.net = net;
	}
	public String getposition() {
		return position;
	}
	
	public void setposition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Employee ["+super.toString() + ", net=" + net + ", position=" + position + "]";
	}

	public static void main(String[] args) {
		Address address = new Address();
		
		Person employee = new Employee("Viet", "Nguyen Van", address, (byte) 20, 5_000, "Dev");
		
		System.out.println(employee);
	}
	
	
}
