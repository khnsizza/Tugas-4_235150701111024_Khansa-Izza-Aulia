package main;
import kelas.*;

public class Main {
    public static void main(String[] args) {
        TextBook TextBook = new TextBook("Java Programming", "John Smith", 2020, "Java");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Southern Gothic");
        Magazine magazine = new Magazine("National Georaphic", "Various", 2021, "Georaphic");

        System.out.println("---- Book Information ----\n");
        TextBook.tampilkanInfo();
        System.out.println();
    

        novel.tampilkanInfo();
        System.out.println();

        magazine.tampilkanInfo();
        System.out.println();

        System.out.println("---- Borrowing and Returning Books ----");
        TextBook.borrowBook();
        
        TextBook.returnBook();

        novel.returnBook();

        magazine.borrowBook();
    }
}


