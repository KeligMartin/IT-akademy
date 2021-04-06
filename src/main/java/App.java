import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Sausage sausage = new Sausage(10.2, 3.8, Meat.SHEEP);
        Merguez merguez = new Merguez(9.8, 3.6, Meat.SHEEP, 4);
        Sausage sausage1 = new Sausage(10.2, 3.8, Meat.SHEEP);
        Sausage sausage2 = new Sausage(10.2, 3.8, Meat.SHEEP);
        Sausage sausage3 = new Sausage(10.2, 3.8, Meat.SHEEP);
        Sausage sausage4 = new Sausage(10.2, 3.8, Meat.SHEEP);

        List<Sausage> sausages = new ArrayList<>();

        sausages.add(sausage);
        sausages.add(sausage1);
        sausages.add(sausage2);
        sausages.add(sausage3);
        sausages.add(sausage4);
        sausages.add(merguez);

        for(Sausage s: sausages){
            System.out.println(s); // avant cuisson
            s.cook(5);
            System.out.println(s); // apres cuisson
        }
    }
}
