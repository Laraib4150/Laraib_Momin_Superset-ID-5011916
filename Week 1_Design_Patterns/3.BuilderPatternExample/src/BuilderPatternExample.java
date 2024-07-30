// BuilderPatternExample.java
public class BuilderPatternExample {
    public static void main(String[] args) {
        // Creating different configurations of Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 10")
                .setBluetoothEnabled(true)
                .setWifiEnabled(true)
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        // Printing the computer configurations
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
