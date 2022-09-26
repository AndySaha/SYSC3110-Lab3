public class BuddyInfo {

    private String name;
    private String phone;
    private String address;

    public BuddyInfo() {
        name = "Todd";
        phone = "6136786932";
        address = "123 Sesame Street";
    }
    public BuddyInfo(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public static void main(String[] args) {
        System.out.println("Hello " + new BuddyInfo().getName());
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
