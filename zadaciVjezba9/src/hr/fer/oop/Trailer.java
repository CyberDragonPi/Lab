abstract class Trailer implements Encodable{
	private int numberofWheels;
	private int trailerWeight;
	
	Trailer() {
		this.numberofWheels = 0;
		this.trailerWeight = 0;
	}
	
	public int getNumberOfWheels() {
		return this.numberofWheels;
	}
	
	public int getTrailerWeight() {
		return this.trailerWeight;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberofWheels = numberOfWheels;
	}
	
	public void setTrailerWeight(int trailerWeight) {
		this.trailerWeight = trailerWeight;
	}
	
	@Override
	public String toString() {
		return this.getNumberOfWheels() + "/" + this.getTrailerWeight();
	}
	
	public void encode() {
		int newWeight = 0;
		int copyTrailerWeight = this.getTrailerWeight();
		
		while (copyTrailerWeight > 0 ) {
			newWeight += copyTrailerWeight %10;
			copyTrailerWeight /= 10;
		}
		this.setTrailerWeight(this.getTrailerWeight() % this.getNumberOfWheels());
		this.setNumberOfWheels(newWeight * this.getNumberOfWheels());
	}
}
