package kelas;

public class Novel extends Book implements BookOperations {
    private String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void borrowBook() {
        String status = isBorrowed() ? " was borrowed." : " borrowed successfully.";
        setBorrowed(true);
        System.out.println("Novel    : " + gettitle() + status);
    }
    
    @Override
    public void returnBook() {
        String status = isBorrowed() ? " returned successfully." : " is not borrowed.";
        setBorrowed(false);
        System.out.println("Novel    : " + gettitle() + status);
    }
    

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Genre     : " + this.genre);
    }
}
