package Sinks;

import enums.LogLevel;

public interface LogSink {
    void log(LogLevel level, String message);
}
