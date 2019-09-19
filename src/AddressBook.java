
import java.util.*;

public class AddressBook {
	
	public static void addBuddy(ArrayList<BuddyInfo> lst, BuddyInfo buddy) {
		lst.add(buddy);
	}
	
	public static void removeBuddy(ArrayList<BuddyInfo> lst, BuddyInfo buddy) {
		lst.remove(buddy);
	}

	public static void main(String args[]) {
		ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
		
		BuddyInfo b1 = new BuddyInfo("Ben Carter", "483 Henders Cr", "987-654-3210");
		BuddyInfo b2 = new BuddyInfo("John Carter", "483 Henders Cr", "123-456-7890");
		BuddyInfo b3 = new BuddyInfo("Alice Carter", "483 Henders Cr", "741-852-9630");
		BuddyInfo b4 = new BuddyInfo("Carson Carter", "483 Henders Cr", "369-025-8147");
		BuddyInfo b5 = new BuddyInfo("Addison Carter", "483 Henders Cr", "045-632-1798");
		BuddyInfo b6 = new BuddyInfo("Annabele Carter", "483 Henders Cr", "753-159-8426");
		
		
		addBuddy(buddies, b1);
		addBuddy(buddies, b2);
		addBuddy(buddies, b3);
		addBuddy(buddies, b4);
		addBuddy(buddies, b4);
		addBuddy(buddies, b5);
		addBuddy(buddies, b6);
		
		removeBuddy(buddies, b4);
		
		System.out.println("Address Book");
		
		
	}
}
