package taste;

import java.util.ArrayList;
import java.util.List;

public class Person implements Choices {

    String firstName;
    String lastName;
    List<Aliment> aliments;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aliments = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Aliment> getAliments() {
        return aliments;
    }

    public void setAliments(List<Aliment> aliments) {
        this.aliments = aliments;
    }

    @Override
    public void like(Aliment aliment) {
        if(!this.aliments.contains(aliment)){
            this.aliments.add(aliment);
        }
    }

    @Override
    public void dislike(Aliment aliment){
        this.aliments.remove(aliment);
    }
}
