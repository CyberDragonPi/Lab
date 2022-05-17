package hr.fer.oop.samostalni4.zad3;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("log.txt");
        LogProcessor processor = new LogProcessor(inputFile);
        processor.load();
        List<LogEntry> logs = processor.getLogs();
        System.out.printf("|%s| |%s| |%s| |%s|",logs.get(0).getTime(),logs.get(0).getLevel(),logs.get(0).getThread(),logs.get(0).getText());
    }
}
