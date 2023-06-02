
//import the ArrayList class
import java.util.ArrayList;
//arraylist has methods like add to add an element, remove to remove an element which we have used below
//we use the get method to access an item in array list
//to modify the element we use the set method

//Library.java

public class Library {
    private ArrayList < Book > books;

    // Create an ArrayList object,
    public Library() {
        books = new ArrayList < Book > ();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList < Book > getBooks() {
        return books;
    }
}
