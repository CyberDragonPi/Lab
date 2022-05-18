import java.util.*;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
	private int fileSizeFilter;
	private int dirSizeFilter;
	private Set<Path> filesBelowFilter;
	private Set<Path> dirsBelowFilter;
	
	public JavaProjectFileVisitor(int fileSizeFilter, int dirSizeFilter) {
		this.fileSizeFilter = fileSizeFilter;
		this.dirSizeFilter = dirSizeFilter;
		this.filesBelowFilter = new HashSet<>();
		this.dirsBelowFilter = new HashSet<>();
	}
	
	public Set<Path> getFilesBelowFilter() {
		return (Set<Path>)this.filesBelowFilter;
	}
	
	public Set<Path> getDirsBelowFilter() {
		return (Set<Path>)this.dirsBelowFilter;
	}
	
	
	@Override
	public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) throws IOException {
		String filename = file.toAbsolutePath().toString();
		Integer lastIndexOfSeparator = filename.lastIndexOf('\\'); //mozda treba promijenit znak u '/', ovisno o lokalnim postavkama
		String name = filename.substring(lastIndexOfSeparator + 1);
		
		//System.out.println(filename + " " + name);
		if (Files.isDirectory(file)) {
			System.out.println("File: " + file + " Name length: " + name.length() + " " + this.dirSizeFilter);
			if (name.length() < this.dirSizeFilter) {
				dirsBelowFilter.add(file);
			}
		}
		
		return FileVisitResult.CONTINUE;
	}
	
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException  {
		String filename = file.toAbsolutePath().toString();
		Integer lastIndexOfSeparator = filename.lastIndexOf('\\'); //mozda treba promijenit znak u '/', ovisno o lokalnim postavkama
		
		String name = filename.substring(lastIndexOfSeparator + 1);
		//System.out.println(filename + " " + name);
		if (file.toFile().isFile()) {
			System.out.println("File: " + file + " Name length: " + name.length() + " " + this.fileSizeFilter);
			if (name.length() < this.fileSizeFilter) {
				filesBelowFilter.add(file);
			}
		} 
		return FileVisitResult.CONTINUE;
	}
}
