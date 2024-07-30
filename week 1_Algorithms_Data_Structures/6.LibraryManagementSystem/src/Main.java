// Main.java
public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding Books
        library.addBook(new Book("B001", "Java Programming", "Alice Smith"));
        library.addBook(new Book("B002", "Data Structures", "Bob Brown"));
        library.addBook(new Book("B003", "Algorithms", "Carol Johnson"));

        // Linear Search
        System.out.println("Linear Search Result: " + library.findBookByTitleLinear("Data Structures"));

        // Sort Books and Perform Binary Search
        library.sortBooksByTitle();
        System.out.println("Binary Search Result: " + library.findBookByTitleBinary("Algorithms"));
    }
}
