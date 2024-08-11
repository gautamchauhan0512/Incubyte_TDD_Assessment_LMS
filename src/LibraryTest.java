
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
}