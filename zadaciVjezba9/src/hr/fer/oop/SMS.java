class SMS extends Message {
	private String recipientNumber;
	
	public SMS(String text) {
		super(text);
		this.recipientNumber = new String();
	}
	
	public String getRecipientNumber() {
		return this.recipientNumber;
	}
	
	public void setRecipientNumber(String recipientNumber) {
		this.recipientNumber = recipientNumber;
	}
	
	public String toString() {
		return super.toString() + " " + this.getRecipientNumber();
	}

}
