package fi.haaga.helia.Coursework.domain;


public class Book {

    private String title;
    private String author;
    private int year;
    private String ISBN;
    private Double price;



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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title " + getTitle() + " author " + getAuthor() + " year " + getYear() + " ISBN " + getISBN() + " price " + getPrice();
    }
}