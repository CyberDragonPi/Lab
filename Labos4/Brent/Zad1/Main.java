package hr.fer.oop.lab4.brentov_zad;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputfile = Path.of("brent.txt");
        Path outputFile = Path.of("izlaz.txt");
        FileEditor.processFile(inputfile,outputFile);
    }
}
