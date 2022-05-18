package task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException{
		System.out.println("Kreni");
		Path path1Java = Path.of("D:/FER/2. Semestar/OOP/novi3/folder2/b1.java");
		Path path2Java = Path.of("D:/FER/2. Semestar/OOP/novi3/folder2/b2.java");
		Path path3PDF = Path.of("D:/FER/2. Semestar/OOP/novi3/folder2/b3.pdf");
		//Files.delete(path1Java);
		//Files.delete(path2Java);
		//Files.delete(path3PDF);
		//Files.createFile(path1Java);
		//Files.createFile(path2Java);
		//Files.createFile(path3PDF);
		JavaProjectFileVisitor visitor = new JavaProjectFileVisitor(Set.of(".pdf"));
		File f = new File("D:/FER/2. Semestar/OOP/novi3");
		System.out.println(f.exists());
		Files.walkFileTree(f.toPath(), visitor);
		Map<String, Set<Path>> map = visitor.getProjectPathsPerExtension();
		for(String key : map.keySet()) {
		  Set<Path> list = map.get(key);
		  for(Path p : list)
		    System.out.println("Key: " + key + " - " + p);
		}
	}

}
