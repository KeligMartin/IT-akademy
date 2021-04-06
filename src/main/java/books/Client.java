package books;

import java.util.ArrayList;
import java.util.List;

public class Client implements Actions {

    private String firstName;
    private String lastName;
    private List<Book> booksList;

    public void read(Book book){
        if(booksList.contains(book)){
            System.out.println(this.firstName + " a déjà lu " + book.getTitle());
        }
        else {
            booksList.add(book);
        }
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksList = new ArrayList<>();
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

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }
}
