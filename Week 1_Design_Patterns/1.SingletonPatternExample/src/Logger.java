
public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialize logging settings here if needed
    }

    // Public static method to provide the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

