package taste;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Person person = new Person("Kelig", "Martin");
        Person person1 = new Person("Relig", "Martin");
        Person person2 = new Person("Telig", "Martin");
        Person person3 = new Person("Nelig", "Martin");


        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        List<Person> adorateursDeCornichons = new ArrayList<>();



        System.out.println(person.getAliments());
        person.like(Aliment.PICKLE);
        person1.like(Aliment.PICKLE);
        person2.like(Aliment.PICKLE);
        person3.like(Aliment.PICKLE);
        System.out.println(person.getAliments());
        person.dislike(Aliment.PICKLE);
        System.out.println(person.getAliments());

        for(Person p: persons){
            if (p.getAliments().contains(Aliment.PICKLE)){
                adorateursDeCornichons.add(p);
            }
        }

        // adorateursDeCornichons = persons.stream().filter(p -> p.getAliments().contains(Aliment.PICKLE)).collect(Collectors.toList());

        System.out.println(adorateursDeCornichons);

    }
}
