package hr.fer.oop.task1;

public class main {

	public static void main(String[] args) {
		Ladder ladder = new Ladder();
		//System.out.println(ladder.count());
		ladder.join("Ante");
		//System.out.println(ladder.count());
		ladder.join("pero");
		//System.out.println(ladder.count());
		ladder.join("febo");
		//System.out.println(ladder.count());
		ladder.join("pero");
		//System.out.println(ladder.count());
		//ladder.standings();
		ladder.gameFinished("pero", "febo");
		//ladder.standings();
	}

}
