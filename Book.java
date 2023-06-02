

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
// and methods to add and remove books from a collection.

//A collection is a framework that stores objects for this question we'll use arrays,
//if it's a collection take note of the data type
//Array:size of array cannot be changed, limited length, static,
//Array lists:Arrays can be made changes onto easily, variable length,dynamic
public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN=ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
