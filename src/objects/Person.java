package objects;

public class Person {
	
	// Constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	
	// Classes variables
	private static int cnt = 0;

	// Object's properties
	private String firstName;
	private String lastName;
	protected byte age;
	
	// Constructor method
	public Person() {
//		firstName = "No firstName";
//		lastName = "No lastName";
//		age = 0;
		
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE);
	}

	public Person(byte age) {
		this(Person.FIRSTNAME, Person.LASTNAME, age);
	}

	public Person(String firstName, String lastName, byte age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
		// Tang bien dem doi tuong
		Person.cnt++;
	}
	
	public static int getCountPerson() {
		return Person.cnt;
	}
	
	// Other method
	public String toString() {
		return lastName + " " + firstName + ", " + age;
	}

	// Getter methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public byte getAge() {
		return age;
	}
	
	// Setter methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// Khai bao va khoi tao doi tuong
		Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte)18);
		Person p3 = new Person("Viet", "Nguyen Van", (byte)20);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("So the hien doi tuong: " + Person.getCountPerson());
		
	}
	
}
