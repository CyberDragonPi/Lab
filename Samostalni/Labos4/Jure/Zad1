package hr.fer.oop.samostalni4.zad1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
    private Set<String> ekstenzije;
    private Map<String, Set<Path>> mapa = new HashMap<>();
    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        this.ekstenzije = extensionFilter;
    }
    public Map<String, Set<Path>> getProjectPathsPerExtension() {
        return mapa;
    }
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String name = file.toString().substring(file.toString().lastIndexOf("."));
        Set<Path> novi = new HashSet<>();
        novi.add(file);
        if (!ekstenzije.contains(name)) {
            if (mapa.get(name) == null) {
                mapa.putIfAbsent(name, novi);
            } else {
                mapa.get(name).add(file);
            }
        }
        return FileVisitResult.CONTINUE;
    }

}
