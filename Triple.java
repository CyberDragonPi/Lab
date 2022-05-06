
class Triple <T>{
	private T first;
	private T second;
	private T third;
	
	public Triple(T first, T second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public T getElement(int index) {
		if (index == 1) {
			return this.first;
		} else if (index == 2) {
			return this.second;
		} else if (index == 3) {
			return this.third;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void setElement(int index, T element) {
		if (element instanceof T) {
			if (index == 1) {
				this.first = element;
			} else if (index == 2) {
				this.second = element;
			} else if (index == 3) {
				this.third = element;
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}
