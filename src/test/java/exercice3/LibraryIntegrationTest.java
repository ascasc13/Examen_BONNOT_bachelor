package exercice3;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryIntegrationTest {

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell");
        User user = new User("John");

        library.addBook(book);
        assertTrue(library.isBookAvailable(book));

        library.borrowBook(book, user);
        assertFalse(library.isBookAvailable(book));
        assertTrue(user.getBorrowedBooks().contains(book));
    }
}

