import java.util.*;

public class AddressBook {

    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Eric","6134206666","123 Street Ln");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
