package homeworkTommorow;

public class Person {
    String name;
    int age;
    Address address;

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}