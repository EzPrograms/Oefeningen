/*
package logica;

import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private int numPages;
    private int publishedYear;

    public Book(String title, String author,String isbn, int numPages, int publishedYear){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numPages = numPages;
        this.publishedYear = publishedYear;

    }
    public Book(String title, String author,String isbn){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        numPages = 0;
        publishedYear = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
    public static boolean isValidISBN(String isbn){

        if (isbn.length()!=13){
            return false;
        }else {
            return true;
        }
    }
    public boolean isValid(String title, String author,String isbn, int numPages, int publishedYear){

        if (title.isEmpty() || author.isEmpty()){
            return false;
        } else if (isValidISBN(isbn) && publishedYear !=0 && numPages > 0){
            return true;
        } else {
            return false;
        }
    }
}
*/
