import java.util.ArrayList;

class Book_5 {
    private String title;
    private String author;
    private String ISBN;

    public Book_5(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ")";
    }

    public static void main(String[] args) {
        ArrayList<Book_5> library = new ArrayList<>();

        Book_5 b1 = new Book_5("Java Basics", "James Gosling", "12345");
        Book_5 b2 = new Book_5("OOP Concepts", "Alan Kay", "67890");
 
        library.add(b1);
        library.add(b2);

        System.out.println("Library: " + library);

        library.remove(b1);
        System.out.println("After removal: " + library);
    }
}
