
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo) {
		if(aBuddyInfo != null) {
			this.buddyInfo.add(aBuddyInfo);
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
		if(index >= 0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}

	public static void main(String args[]) {

		AddressBook book = new AddressBook();
		BuddyInfo b1 = new BuddyInfo("Ben Carter", "483 Henders Cr", "987-654-3210");
		book.addBuddy(b1);
		book.removeBuddy(0);
		
		
	}
}
