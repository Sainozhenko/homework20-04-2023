package homeworkTommorow;


public class Address {
    String street;
    int houseNumber;

    @Override
    public String toString() {
        return "\nAddress " +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber + "\n";
    }

    Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }
}