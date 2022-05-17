package hr.fer.oop.samostalni4.zad5;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileEditor {
    public static void processFile(Path inputFile, Path outputFile) throws IOException{
        List<String> lines = Files.readAllLines(inputFile);
        Writer writer = new FileWriter (outputFile.toFile());
        for (String line: lines){
            line += '\n';
            writer.write(line);
        }
        writer.flush();
    }
}
