import Sinks.ConsoleLogSink;
import Sinks.FileLogSink;
import enums.LogLevel;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.addSink(new ConsoleLogSink());
        logger.addSink(new FileLogSink("application.log"));

        logger.setLogLevel(LogLevel.INFO);

        logger.debug("This is a debug message."); // Will not be logged
        logger.info("This is an info message.");  // Will be logged
        logger.warn("This is a warning message."); // Will be logged
        logger.error("This is an error message."); // Will be logged
        logger.fatal("This is a fatal message."); // Will be logged
    }
}
