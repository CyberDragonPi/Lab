
class CampTrailer extends Trailer {
	private int peopleCapacity;
	private int volume;
	
	public CampTrailer() {
		super();
		this.peopleCapacity = 0;
		this.volume = 0;
	}
	
	public int getPeopleCapacity() {
		return this.peopleCapacity;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void setPeopleCapacity(int peopleCapacity) {
		this.peopleCapacity = peopleCapacity;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/" + this.getPeopleCapacity() + "/" + this.getVolume();
	}

}
