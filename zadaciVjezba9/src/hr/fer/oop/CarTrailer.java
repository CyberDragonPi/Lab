
class CarTrailer extends Trailer {
	private int maxLoad;
	
	public CarTrailer() {
		super();
		this.maxLoad = maxLoad;
	}
	
	public int getMaxLoad() {
		return this.maxLoad;
	}
	
	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/" + this.getMaxLoad();
	}

}
