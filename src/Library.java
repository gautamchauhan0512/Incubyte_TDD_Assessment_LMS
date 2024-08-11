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
    public void borrowBook(String title) {   
        for(Library k : library){
            if (k.title.equals(title) && !k.isBorrowed) {
                k.isBorrowed = true;
                System.out.println("You have borrowed the book " + title);
                return;
            }
        }
         System.out.println("The Book " + title + " is unavailable or already borrowed");
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

    public void returnBook(String title){
        for (Library k : library) {
            if (k.title.equals(title) && k.isBorrowed) {
                k.isBorrowed = false;
                return;
            }
        }
        System.out.println("This book is not borrowed from this library");
    }
}