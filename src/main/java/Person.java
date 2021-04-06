import java.time.LocalDate;

public class Person {

    private String name;
    private String firstName;
    private LocalDate birthDate;
    private Address address;

    public Person(String name, String firstName, LocalDate birthDate, Address address){
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
