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
        for (Library k : library) {
            if (k.isbn.equals(isbn)) {
                System.out.println("Book with ISBN " + isbn + " already exists.");
                return;
            }
        }
        Library newBook = new Library(isbn, title, author, year);
        library.add(newBook);
        System.out.println("Book is added");
    }

    public int lengthOfLibrary() {
        return library.size();
    }
    public void borrowBook() {   
        for(Library k : library){
            k.isBorrowed = true;
            return;
        }  
    }
    public int availableBook() {
        int availableBooksCount = 0;
        for (Library k : library) {
            if (!k.isBorrowed) {
                availableBooksCount++;
            }
        }
        return availableBooksCount;
    }
   
}