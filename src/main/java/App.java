
public class App {

    public static void main(String[] args) {
        Sausage sausage = new Sausage(10.2, 3.8, Meat.SHEEP);
        Merguez merguez = new Merguez(9.8, 3.6, Meat.SHEEP, 4);
        System.out.println(sausage);
        System.out.println(merguez);
        sausage.cook();
        merguez.cook();
        System.out.println(sausage);
        System.out.println(merguez);
    }
}
