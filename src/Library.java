import java.util.ArrayList;

public class Library {

    String isbn;
    String title;
    String author;
    int year;
    boolean isBorrowed; // Flag to indicate if the book is borrowed
    private static ArrayList<Library> book = new ArrayList<>();

    public Library(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false; // Initially, the book is not borrowed
    }

    public void addBook(String isbn, String title, String author, int year) {
        if (findBookByIsbn(isbn) != null) {
            return;
        }
        book.add(new Library(isbn, title, author, year));
    }

    public void borrowBook(String title) {
        for (Library library : book) {
            if (library.title.equals(title) && !library.isBorrowed) {
                library.isBorrowed = true;
                System.out.println("You have borrowed the book " + title);
                return;
            }
        }
        System.out.println("The Book " + title + " is unavailable or already borrowed");
    }

    public void returnBook(String title) {
        for (Library library : book) {
            if (library.title.equals(title) && library.isBorrowed) {
                library.isBorrowed = false;
                return;
            }
        }
        System.out.println("This book is not borrowed from this library");
    }

    public int availableBook() {
        int Count = 0;
        for (Library library : book) {
            if (!library.isBorrowed) {
                Count++;
            }
        }
        return Count;
    }

    public Library findBookByIsbn(String isbn) {
        for (Library library : book) {
            if (library.isbn.equals(isbn)) {
                return library;
            }
        }
        return null;
    }

    public int lengthOfLibrary() {
        return book.size();
    }
}