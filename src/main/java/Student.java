import java.time.LocalDate;

public class Student extends Person {

    private Promotion promotion;

    public Student(String name, String firstName, LocalDate birthDate, Address address, Promotion promotion){
        super(name, firstName, birthDate, address);
        this.promotion = promotion;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "promotion=" + promotion +
                '}';
    }
}
