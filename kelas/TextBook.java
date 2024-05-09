package kelas;


public class TextBook extends Book implements BookOperations {

    private String subjek;

    public TextBook(String title, String author, int year, String subjek) {
        super(title, author, year);
        this.subjek = subjek;
    }


    @Override
    public void borrowBook() {
        String status = isBorrowed() ? " was borrowed." : " borrowed successfully.";
        setBorrowed(true);
        System.out.println("Textbook : " + gettitle() + status);
    }
    
    @Override
    public void returnBook() {
        String status = isBorrowed() ? " returned successfully." : " is not borrowed.";
        setBorrowed(false);
        System.out.println("Textbook : " + gettitle() + status);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Subject   : " + this.subjek);
    }
}


