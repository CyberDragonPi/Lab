package task1;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path>{
    Map<String,Long> mapa = new HashMap<>();
    
    public Map<String, Long> getProjectFileSizeInfo(){
        return mapa;
        
    }
    
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();
        int index = fileName.lastIndexOf(".");
        if(index > 0) {
            Long val = mapa.get(fileName.substring(index));
            mapa.put(fileName.substring(index), (long) (val == null ? Files.size(file) : val + Files.size(file)));
        }
        return FileVisitResult.CONTINUE;    
    }
}
