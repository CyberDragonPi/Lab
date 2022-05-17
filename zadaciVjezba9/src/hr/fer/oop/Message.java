abstract class Message implements Encodable{
	private String text;
	
	Message(String text) {
		this.text = text;
	}
	
	
	public String toString() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void encode() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.text.length(); i++) {
			char c = this.text.charAt(i);
			if (c == 'Z') {
				sb.append('A');
			} else if (c == 'z') {
				sb.append('a');
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				sb.append((char)(c + 1));
			} else {
				sb.append(c);
			}
		}
		this.text = sb.toString();
	}
}
