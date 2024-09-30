package Sinks;
import enums.LogLevel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogSink implements LogSink {
    private String filePath;

    public FileLogSink(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(LogLevel level, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("[" + level + "] " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
