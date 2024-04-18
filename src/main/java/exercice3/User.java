package exercice3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User {
    private String name;
    private final List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public Collection<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Getters and setters pour 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


