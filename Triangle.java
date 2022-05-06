
class Triangle extends Triple<String> {
	
	public Triangle(String first, String second, String third) {
		super(first, second, third);
	}
	
	public static boolean sharedVertex(Triple<String> triangleOne, Triple<String> triangleTwo) {
		boolean isShared = false;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (triangleOne.getElement(i).equals(triangleTwo.getElement(j))) {
					isShared = true;
				}
			}
		}
		return isShared;
	}

}
