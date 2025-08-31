package dk.school.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private final String name;
    // BUG: eksponerer intern tilstand via getter (returnerer direkte liste)
    private final List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // BUG: tillader 4 bøger
    public boolean borrowBook(Book b) {
        if (borrowedBooks.size() <= 3) {
            borrowedBooks.add(b);
            return true;
        }
        return false;
    }

    public boolean hasBook(Book b) {
        return borrowedBooks.contains(b);
    }

    // BUG: fjerner via en ny instans (afhænger af equals-implementering)
    public boolean returnBook(Book b) {
        Book tmp = new Book(b.getTitle(), b.getAuthor(), b.getIsbn());
        return borrowedBooks.remove(tmp);
    }

    // BUG: eksponerer ændringsbar liste (burde returnere en kopi eller unmodifiable)
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + "'" +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
