package task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path>{
	private Set<String> extensionFilter;
	private Map<String, Set<Path>> projectPathsPerExtension;
	
	public JavaProjectFileVisitor(Set<String> extensionFilter) {
		this.extensionFilter = extensionFilter;
		this.projectPathsPerExtension = new HashMap<>();
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		String fileName = file.getFileName().toString();
		Integer lastDot = fileName.lastIndexOf(".");
		if (lastDot != -1) {
			String extension = fileName.substring(lastDot);
			Set<Path> newSet = new HashSet<>();
			if (!this.extensionFilter.contains(extension)) {
				if(!projectPathsPerExtension.containsKey(extension)) {
					newSet.add(file);
					projectPathsPerExtension.put(extension, newSet);
				} else {
					newSet.addAll(projectPathsPerExtension.get(extension));
					newSet.add(file);
					projectPathsPerExtension.put(extension, newSet);
				}
			}
		}
		return FileVisitResult.CONTINUE;
	}
	
	public Set<String> getExtensionFilter() {
		return this.extensionFilter;
	}
	
	public Map<String, Set<Path>> getProjectPathsPerExtension() {
		return this.projectPathsPerExtension;
	}
}
