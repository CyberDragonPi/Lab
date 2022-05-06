
public class main {

	public static void main(String[] args) {
		Triple<String> t1 = new Triangle("Zagreb", "Split", "Rijeka");
		Triple<String> t2 = new Triangle("London", "New York", "Madrid");
		boolean shareCity = Triangle.sharedVertex(t1, t2);
		System.out.println(shareCity);
 	}

}
