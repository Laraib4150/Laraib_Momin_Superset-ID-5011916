// RealImage.java
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename + " from disk...");
        // Simulate loading from a remote server
        try {
            Thread.sleep(2000); // simulate time delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(filename + " loaded.");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
