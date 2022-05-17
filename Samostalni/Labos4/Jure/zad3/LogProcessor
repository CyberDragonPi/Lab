package hr.fer.oop.samostalni4.zad3;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LogProcessor {
    private Path file;
    private List<LogEntry> lista = new LinkedList<>();
    public LogProcessor(Path file) {
        this.file = file;
    }
    public void load() throws IOException {
        List<String> nova = Files.readAllLines(file);
        for (String s : nova) {
            lista.add(parseLog(s));
        }
    }
    public List<LogEntry> getLogs() {
        return lista;
    }
    public static LogEntry parseLog(String s) {
            String time, level, thread, text;
            String[] vreme = s.split("\\s+");
            //System.out.println(vreme);
            time = (vreme[0] +" "+ vreme[1]).trim();
            String[] s2 = s.split("\\s+");
            level = s2[2].trim();
            String tempThread = s.substring(s.indexOf("]") + 1);
            Integer firstIndexOfThread = tempThread.indexOf("[");
            Integer lastIndexOfThread = tempThread.indexOf("]");
            thread = tempThread.substring(firstIndexOfThread+1,lastIndexOfThread).trim();
            text = s.substring(s.lastIndexOf(":")+1).trim();
        return new LogEntry(time,level,thread,text);
    }
}
