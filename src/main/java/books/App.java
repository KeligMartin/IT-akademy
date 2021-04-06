package books;

public class App {

    public static void main(String[] args) {
        Book book = new Book("Victor Hugo", "Les Misérables", 546);
        Book book2 = new Book("Le père Goriot", "De Balzac", 8670);
        Book book3 = new Book("Candide", "Voltaire", 300);
        Visitor visitor = new Visitor();
        Client client = new Client("Kelig", "Martin");


        client.read(book);
        client.read(book2);
        client.read(book3);
        client.read(book);

        visitor.read(book);
    }
}
