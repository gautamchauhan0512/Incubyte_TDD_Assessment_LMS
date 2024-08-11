
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;;
public class LibraryTest {
 
    Library obj = new Library("","","",0);
    @Test
    public void TestaddBook()
    {
        obj.addBook("isbn111", "my name", "gautam chauhan", 2024);
        int result = obj.lengthOfLibrary();
        assertEquals(1, result,"Book is added");
    }  
    @Test
    public void testAddDuplicateBook(){
        obj.addBook("isbn111", "my name", "gautam chauhan", 2024);
        obj.addBook("isbn111", "my name", "gautam chauhan", 2024);
        int result = obj.lengthOfLibrary();
        assertEquals(1, result,"Duplicate book should not be added.");
    }
    @Test
    public void testBorrowBook(){
        obj.addBook("isbn111", "my name", "gautam chauhan", 2024);
        obj.borrowBook("my name");
        assertEquals(0, obj.availableBook(),"You have borrow the book " );
    }
    @Test
    public void testAlreadBorrowOrUnavailable(){
        obj.addBook("isbn111", "my name", "gautam chauhan", 2024);
        obj.borrowBook("my name");
        obj.borrowBook("my name");
        obj.borrowBook("My namee");
        assertEquals(0, obj.availableBook() );
    }
    @Test
    public void returnBookTest(){
        obj.addBook("isbn111", "my name", "gautam chauhan", 2024);
        obj.borrowBook("my name");
        obj.returnBook();
        assertEquals(1, obj.availableBook());
    }
}