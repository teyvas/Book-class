class Book {
    // Attributes
    private String title;
    private String author;
    private String ISBN;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Price: $" + this.price);
    }

    // Method to find the cheapest book from an array of books
    public static Book getCheapestBook(Book[] books) {
        if (books.length == 0) {
            return null;
        }

        Book cheapestBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].price < cheapestBook.price) {
                cheapestBook = books[i];
            }
        }
        return cheapestBook;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects using default constructor
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe", "1234567890", 59.99);
        Book book3 = new Book("Effective Java", "Joshua Bloch", "0987654321", 45.50);

        // Displaying book info
        System.out.println("Book 1 details:");
        book1.displayInfo();
        System.out.println();

        System.out.println("Book 2 details:");
        book2.displayInfo();
        System.out.println();

        System.out.println("Book 3 details:");
        book3.displayInfo();
        System.out.println();

        // Finding the cheapest book
        Book[] books = {book1, book2, book3};
        Book cheapest = Book.getCheapestBook(books);
        System.out.println("Cheapest Book details:");
        if (cheapest != null) {
            cheapest.displayInfo();
        }
    }
}
