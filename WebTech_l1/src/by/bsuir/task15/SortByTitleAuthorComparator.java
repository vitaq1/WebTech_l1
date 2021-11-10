package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class SortByTitleAuthorComparator implements Comparator<Book> {

    private Comparator<Book> comparator;

    public SortByTitleAuthorComparator() {

        comparator = new SortByTitleComparator().thenComparing(new SortByAuthorComparator());
    }


    @Override
    public int compare(Book b1, Book b2) {
        if ((b1 == null) || (b2 == null)) {
            throw new IllegalArgumentException("Книги не должны быть null");
        }

        return comparator.compare(b1, b2);
    }
}
