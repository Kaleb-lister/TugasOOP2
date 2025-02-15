import java.util.ArrayList;


public class Library {
    ArrayList<Book> books;

    //Constructor -> Function yang pertama kali dijalankan ketika object di create
    public Library() {
        books = new ArrayList();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.title);
    }

    public void borrowBook(Borrower borrower, Book book) {
        System.out.println(borrower.name + " borrowed: " + book.title); // Alice borrowed: Java Programming
        borrower.borrowBook(book);
        books.remove(book);
    }
    public void returnBook(Borrower borrower, Book book) {
        System.out.println(borrower.name + " returned " + book.title); // Alice returned Java Programming
        books.add(book);
        borrower.returnBook(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in library:");
        for (Book book : books) { //Kita buat variable book yang tipe data nya = Book, 
                                //kita looping dari awal books sampai akhir
            book.displayBook();
        }
    }
    
}
