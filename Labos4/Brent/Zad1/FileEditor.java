package hr.fer.oop.lab4.brentov_zad;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileEditor {
    public static void processFile(Path inputFile, Path outputFile) throws IOException {
        List<String> retci = Files.readAllLines(inputFile);
        Writer fw = new FileWriter(outputFile.toFile());
        for (String redak : retci) {
            final String remove = "\t";
            String pomocni = redak;
            int i = 0;
            while(pomocni.startsWith(remove)) {
                i++;
                pomocni = pomocni.substring(1);
            }
            StringBuilder  drugipomocni = new StringBuilder();
            for (int j = 0; j < i; j++) {
                drugipomocni.append("  ");
            }
            fw.write(drugipomocni.toString()+ pomocni + "\n");
            fw.flush();
        }
        fw.close();
    }
}
