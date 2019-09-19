
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	public BuddyInfo(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	//public BuddyInfo() {...}
	//O(n) to find memory to allocate the defaults, so use the more detailed BuddyInfo constructor with basic values
	public BuddyInfo() {
		this("John Doe", "125 Barned Dr", "6125489556");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {

		BuddyInfo b = new BuddyInfo("Alex Henderson", "156 Blaire St", "524-985-8974");
		
		System.out.println("My name is " + b.getName() + " and I live at " + b.getAddress() + " and my number is " + b.getPhoneNumber() + "!");

	}

}
