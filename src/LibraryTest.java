
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;;

public class LibraryTest {

    Library obj = new Library("", "", "", 0);// Initialize Library instance

    @Test
    public void testAddBook() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        int result = obj.lengthOfLibrary();
        assertEquals(1, result, "Book is added");
    }

    @Test
    public void testAddDuplicateBook() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        int result = obj.lengthOfLibrary();
        assertEquals(1, result, "Duplicate book should not be added.");
    }

    @Test
    public void testBorrowBook() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        obj.borrowBook("my village");
        int result = obj.availableBook();
        assertEquals(0, result, "You have borrow the book ");
    }

    @Test
    public void testAlreadBorrowOrUnavailable() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        obj.borrowBook("my village");
        obj.borrowBook("my village");
        obj.borrowBook("My journey");
        int result = obj.availableBook();
        assertEquals(0, result);
    }

    @Test
    public void returnBookTest() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        obj.borrowBook("my village");
        obj.returnBook("my village");
        int result = obj.availableBook();
        assertEquals(1, result);
    }

    @Test
    public void returnBookNotBorrowedTest() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        obj.borrowBook("my village");
        obj.returnBook("my journey");
        int result = obj.availableBook();
        assertEquals(0, result, "This book is not borrowed from this Library");
    }

    @Test
    public void viewAvailableBoookTest() {
        obj.addBook("isbn111", "my village", "gautam chauhan", 2024);
        obj.addBook("isbn106", "my journey", "gautam chauhan", 2024);
        assertEquals(2, obj.availableBook(), "Available books");
        obj.borrowBook("my village");
        assertEquals(1, obj.availableBook(), "Available books");
    }
}