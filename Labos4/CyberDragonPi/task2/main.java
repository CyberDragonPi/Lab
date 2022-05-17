package task2;

import java.io.File;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		File f = new File("D:/FER/2. Semestar/OOP/novi3/a.txt");
		LogProcessor lp = new LogProcessor(f.toPath());
		try {
			lp.load();
		} catch (IOException exc) {
			System.out.println("ezreal");
		}
		for (LogEntry le : lp.getLogs()) {
			System.out.println("|" + le.getTime() + "|");
			System.out.println("|" + le.getLevel() + "|");
			System.out.println("|" + le.getThread() + "|");
			System.out.println("|" + le.getText() + "|");
		}
	}

}
