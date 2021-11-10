package by.bsuir.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;

        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return (title != null && title.equals(book.getTitle())) && (author != null && author.equals(book.getAuthor()) && (price == book.getPrice()));
    }

    @Override
    public int hashCode() {
        return (title.hashCode() * (title.hashCode() + author.hashCode())) % author.hashCode();
    }

    @Override
    public String toString() {
        return "title: " + this.title + " author: " + this.author + " price: " + this.price + " edition: " + Book.edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }
}
