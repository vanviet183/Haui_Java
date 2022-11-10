package objects;

public class Person implements Comparable<Person> {
	
	// Constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final Address ADDRESS = new Address();
	public static final byte AGE = 0;
	
	// Classes variables
	private static int cnt = 0;

	// Object's properties
	private String firstName;
	private String lastName;
	private Address address = new Address();
	protected byte age;
	
	// Constructor method
	public Person() {
		this(Person.FIRSTNAME, Person.LASTNAME, Person.ADDRESS, Person.AGE);
	}

	public Person(byte age) {
		this(Person.FIRSTNAME, Person.LASTNAME, Person.ADDRESS, age);
	}

	public Person(String firstName, String lastName, Address address, byte age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static void main(String[] args) {
		// Khai bao va khoi tao doi tuong
		Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte)18);
		Person p3 = new Person("Viet", "Nguyen Van", new Address(), (byte)20);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("So the hien doi tuong: " + Person.getCountPerson());
		
	}
	
	@Override
	public int compareTo(Person o) {
		return this.age - o.getAge();
	}
	
}
