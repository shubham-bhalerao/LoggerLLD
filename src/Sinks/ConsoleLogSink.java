package Sinks;

import enums.LogLevel;

public class ConsoleLogSink implements LogSink {
    @Override
    public void log(LogLevel level, String message) {
        System.out.println("[" + level + "] " + message);
    }
}