package by.bsuir.task13;

import by.bsuir.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }


    @Override
    public boolean equals(Object obj) {
        ProgrammerBook programmerBook = (ProgrammerBook) obj;;

        if (obj == this) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }

        return super.equals(obj) && language.equals(programmerBook.language) && (programmerBook.level == level);
    }

    @Override
    public int hashCode() {
        return (super.hashCode()+language.hashCode()) % language.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "; language: " + language + "; level: " + level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}