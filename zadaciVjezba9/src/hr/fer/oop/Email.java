class Email extends Message {
	String sender;
	String receiver;
	String subject;
	
	public Email(String text) {
		super(text);
		this.sender = new String();
		this.receiver = new String();
		this.subject = new String();
	}
	
	public String getSender() {
		return this.sender;
	}
	
	public String getReceiver() {
		return this.receiver;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + " " + this.getSender() + " " + this.getReceiver() + " " + this.getSubject();
	}
}
