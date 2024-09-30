import enums.LogLevel;
import Sinks.LogSink;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<LogSink> sinks = new ArrayList<>();
    private LogLevel logLevel = LogLevel.DEBUG;

    public void addSink(LogSink sink) {
        sinks.add(sink);
    }

    public void setLogLevel(LogLevel level) {
        this.logLevel = level;
    }

    public void log(LogLevel level, String message) {
        if (level.getPriority() >= logLevel.getPriority()) {
            for (LogSink sink : sinks) {
                sink.log(level, message);
            }
        }
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void fatal(String message) {
        log(LogLevel.FATAL, message);
    }
}
