package book;

class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

  
    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }
}

// BookDemo Class
public class BookDemo {
    public static void main(String[] args) {
        // Creating a book object using the constructor
        Book myBook = new Book("Developing Java Software", "Russel Winder", 79.75);

        // Printing the book's details using the toString method
        System.out.println(myBook.toString());
    }
}

  
    
    
