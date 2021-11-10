package by.bsuir.task14;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
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


    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book book){
        return this.isbn - book.isbn;
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
