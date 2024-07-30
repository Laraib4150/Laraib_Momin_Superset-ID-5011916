// ECommercePlatform.java
import java.util.Arrays;

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Desk Chair", "Furniture"),
                new Product("4", "Table Lamp", "Furniture")
        };

        // Linear Search
        Product foundProduct = LinearSearch.search(products, "Smartphone");
        System.out.println("Linear Search Result: " + foundProduct);

        // Sort products by name for Binary Search
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));

        // Binary Search
        foundProduct = BinarySearch.search(products, "Table Lamp");
        System.out.println("Binary Search Result: " + foundProduct);
    }
}
