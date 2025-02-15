public class Book {
    public String title;
    public String isbn;
    public Author author;

    // Constructor -> Function yang pertama kali dijalankan ketika object di create
    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
    
    // GETTER -> Function untuk print / mendapatkan variable // panggil variable
    void displayBook(){
        System.out.println("Title:\t" + title);
        System.out.println("ISBN:\t" + isbn);
        System.out.println("Name:\t"+ author.name); // -> System.out.println(name);
        System.out.println("Biography:\t" + author.bio);
        System.out.println("--------------------");
    }

}
