package books;

public class Visitor implements Actions {

    public Visitor(){ }


    @Override
    public void read(Book book) {
        System.out.println(book.getTitle() + " est lu par un visiteur");
    }
}
