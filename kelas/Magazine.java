package kelas;

public class Magazine extends Book implements BookOperations {
    private String kategori;

    public Magazine(String title, String author, int year, String kategori) {
        super(title, author, year);
        this.kategori = kategori;
    }


    @Override
    public void borrowBook() {
    String status = isBorrowed() ? " was borrowed." : " borrowed successfully.";
    setBorrowed(true);
    System.out.println("Magazine : " + gettitle() + status);
}

    @Override
    public void returnBook() {
    String status = isBorrowed() ? " returned successfully." : " is not borrowed.";
    setBorrowed(false);
    System.out.println("Magazine : " + gettitle() + status);
}

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Category  : " + this.kategori);
    }
}

