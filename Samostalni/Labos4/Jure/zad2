package hr.fer.oop.samostalni4.zad2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
    Map<String, Long> mapa = new HashMap<>();
    public Map<String, Long> getProjectFileSizeInfo() {
        return mapa;
    }
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String extension = file.toString().substring(file.toString().lastIndexOf("."));
        if (mapa.get(extension) == null) {
            mapa.put(extension,Files.size(file));
        } else {
            Long l = mapa.get(extension);
            mapa.put(extension,l+Files.size(file));
        }
        return FileVisitResult.CONTINUE;
    }
}
