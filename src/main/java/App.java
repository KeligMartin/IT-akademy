import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Address address = new Address(10, "Rue de Paris");
        Student student = new Student("Martin", "Kelig", LocalDate.of(1997, 4, 4), address, Promotion.DFS20C);
        Student student1 = new Student("Tartin", "Melig", LocalDate.of(1997, 4, 4), address, Promotion.DFS21C);
        Student student2 = new Student("Partin", "Relig", LocalDate.of(1997, 4, 4), address, Promotion.DFS22C);
        Student student3 = new Student("Lartin", "Telig", LocalDate.of(1997, 4, 4), address, Promotion.DFS20C);
        Student student4 = new Student("Sartin", "Jelig", LocalDate.of(1997, 4, 4), address, Promotion.DFS21C);
        Student student5 = new Student("Zartin", "Nelig", LocalDate.of(1997, 4, 4), address, Promotion.DFS22C);

        List<Student> students = new ArrayList<>();
        List<Student> dfs20c = new ArrayList<>();

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student s: students){
            if(s.getPromotion() == Promotion.DFS20C){
               dfs20c.add(s);
            }
        }
        System.out.println(dfs20c);
    }
}
