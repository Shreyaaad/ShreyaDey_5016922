package SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        if (logger1 == logger2) {
            System.out.println("Logger is a singleton. Both references point to the same instance.");
        } else {
            System.out.println("Logger is not a singleton. The references point to different instances.");
        }
    }
}
