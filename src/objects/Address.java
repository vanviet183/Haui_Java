package objects;

public class Address {

	// Constants
	private static final String CITY_NAME = "No CityName";
	private static final String DISTRICT_NAME = "No DistrictName";
	private static final String STREET_NAME = "No StrictName";
	
	// Object's properties
	private String cityName;
	private String districtName;
	private String streetName;
	
	public Address() {
		this(Address.CITY_NAME, Address.DISTRICT_NAME, Address.STREET_NAME);
	}

	public Address(String cityName, String districtName, String streetName) {
		super();
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	@Override
	public String toString() {
		return cityName + ", " + districtName + ", " + streetName;
	}
	
	public static void main(String[] args) {
		// Khai bao va khoi tao doi tuong
		Address add = new Address("No cityName", "No districtName", "No streetName");
		
		System.out.println(add.toString());
	
	}
	
}
