package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class SortByAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if ((b1 == null) || (b2 == null)) {
            throw new IllegalArgumentException("Книги не должны быть null");
        }

        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
