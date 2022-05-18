package task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.LinkedList;
import java.util.List;

class LogProcessor {
	private Path file;
	private List<LogEntry> logs;
	
	public LogProcessor(Path file) {
		this.file = file;
		this.logs = new LinkedList<>();
	}

	  
	public void load() throws IOException {
		List<String> lines = Files.readAllLines(file);
		
		for (String line : lines) {
			logs.add(this.parseLog(line));
		}
	}

	public List<LogEntry> getLogs() {
		  return this.logs;
	 }

	public static LogEntry parseLog(String line) {
		String[] separated = line.split("\\s+");
		StringBuilder sbTime = new StringBuilder();
		StringBuilder sbLevel = new StringBuilder(); 
		StringBuilder sbThread = new StringBuilder();
		StringBuilder sbText = new StringBuilder(); 
		
		sbTime.append(separated[0] + " " + separated[1]);
		sbLevel.append(separated[2]);
		
		String tempThread = line.substring(line.indexOf("]") + 1);
		Integer firstIndexOfThread = tempThread.indexOf("[");
		Integer lastIndexOfThread = tempThread.indexOf("]");
		sbThread.append(tempThread.substring(firstIndexOfThread + 1, lastIndexOfThread).trim());
		
		Integer firstIndexOfText = line.lastIndexOf(":");
		sbText.append(line.substring(firstIndexOfText + 1).trim());
		return new LogEntry(sbTime.toString(), sbLevel.toString(), sbThread.toString(), sbText.toString());
	}

}
