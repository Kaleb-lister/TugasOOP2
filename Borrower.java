import java.util.ArrayList;
class Borrower {
    public String name;
    public ArrayList<Book> borrowBook;
    
    public Borrower(String name) {
        this.name = name;
        this.borrowBook = new ArrayList();
    }
    
    public void borrowBook(Book book) {
        borrowBook.add(book);
    }
    public void returnBook(Book book) {
        borrowBook.remove(book);
    }

    // GETTER
    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:"); // Alice's borrowed books:

        // For each / Enchanced For Loop
        for (Book book : borrowBook) {
            book.displayBook();
        }
    }
}
