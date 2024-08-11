import java.util.*;
import java.util.ArrayList;

public class Library {

    String isbn;
    String title;
    String author;
    int year;
    boolean isBorrowed; // Flag to indicate if the book is borrowed
    private static ArrayList<Library> library = new ArrayList<>();

    public Library(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false; // Initially, the book is not borrowed
    }

    public void addBook(String isbn, String title, String author, int year) {

        Library newBook = new Library(isbn, title, author, year);
        library.add(newBook);
        System.out.println("Book is added");
    }

    public int lengthOfLibrary() {
        return library.size();
    }

}