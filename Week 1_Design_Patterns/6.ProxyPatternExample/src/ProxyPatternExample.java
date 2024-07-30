// ProxyPatternExample.java
public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display image1
        System.out.println("Displaying image1:");
        image1.display(); // Loading from disk
        image1.display(); // Using cached image

        // Display image2
        System.out.println("Displaying image2:");
        image2.display(); // Loading from disk
        image2.display(); // Using cached image

        // Display image1 again
        System.out.println("Displaying image1 again:");
        image1.display(); // Using cached image
    }
}
