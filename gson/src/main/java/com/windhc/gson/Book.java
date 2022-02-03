package com.windhc.gson;

/**
 * @author HC
 */
public class Book {
    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    private String title;

    private String author;

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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
