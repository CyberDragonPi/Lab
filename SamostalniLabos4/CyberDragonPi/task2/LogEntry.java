package task2;

class LogEntry {
	private String time;
	private String level;
	private String thread;
	private String text;
	
	public LogEntry(String time, String level, String thread, String text) {
		this.time = time;
		this.level = level;
		this.thread = thread;
		this.text = text;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String getLevel() {
		return this.level;
	}
	
	public String getThread() {
		return this.thread;
	}
	
	public String getText() {
		return this.text;
	}
}
