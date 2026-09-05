public class Book {
    int id;
    String title;
    String author;
    boolean available;

    public Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void displayBook() {
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
        
    }

}






