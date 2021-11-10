package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class SortByAuthorTitleComparator implements Comparator<Book> {

    Comparator<Book> comparator;

    public SortByAuthorTitleComparator(){

        comparator = new SortByAuthorComparator().thenComparing(new SortByTitleComparator());
    }

    @Override
    public int compare(Book b1, Book b2) {

        if ((b1 == null) || (b2 == null)) {
            throw new IllegalArgumentException("Книги не должны быть null");
        }

        return comparator.compare(b1, b2);
    }
}
