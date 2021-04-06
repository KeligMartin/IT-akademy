public class Address {

    int number;
    String streetName;

    public Address(int number, String streetName){
        this.number = number;
        this.streetName = streetName;
    }

    public String toString() {
        return "Address{" +
                "number=" + number +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
