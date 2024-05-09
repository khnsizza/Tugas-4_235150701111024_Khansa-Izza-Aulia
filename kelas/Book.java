package kelas;

public abstract class Book {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public String gettitle() {
        return this.title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
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

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed (boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void tampilkanInfo() {
        System.out.println("Title     : " + gettitle());
        System.out.println("Author    : " + getAuthor());
        System.out.println("Year      : " + getYear());
        System.out.println("Borrowed  : " + isBorrowed());
       
    }
}


















    
    
