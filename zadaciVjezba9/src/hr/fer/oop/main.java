
public class main {

	public static void main(String[] args) {
		CarTrailer car = new CarTrailer();
	    car.setNumberOfWheels(2);
	    car.setTrailerWeight(750);
	    car.setMaxLoad(1000);
	    System.out.println(car); //  2/750/1000
	    car.encode();
	    System.out.println(car); //  24/0/1000

	    CampTrailer camp = new CampTrailer();
	    camp.setNumberOfWheels(4);
	    camp.setTrailerWeight(801);
	    camp.setPeopleCapacity(5);
	    camp.setVolume(15);
	    System.out.println(camp); //  4/801/5/15
	    camp.encode();
	    System.out.println(camp); //  36/1/5/15

	}

}
