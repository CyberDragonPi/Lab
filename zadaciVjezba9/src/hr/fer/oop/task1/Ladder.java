package hr.fer.oop.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Ladder {
	private LinkedList<String> players = new LinkedList<>();
	
	public Ladder(String... players) {
		for (String player: players) {
			this.join(player);
		}
	}
	
	public void join(String player) {
		if (this.players.contains(player)) {
			return;
		}
		this.players.add(player);
		return;
	}
	
	public int count() {
		return this.players.size();
	}
	
	public void gameFinished(String winner, String looser) {
		int winnerPlacement = this.players.indexOf(winner);
		int looserPlacement = this.players.indexOf(looser);
		
		this.players.remove(winner);
		this.players.remove(looser);
		//this.standings();
		
		int newLooserPlacement = Math.max(looserPlacement - 1, players.size() - 1);
		int newWinnerPlacement;
		players.add(newLooserPlacement, looser);
		
		if (winnerPlacement > looserPlacement) {
			newWinnerPlacement = Math.min(0, winnerPlacement + 1);
		} else {
			newWinnerPlacement = Math.min(0, winnerPlacement - (looserPlacement - winnerPlacement) / 2);
		}
		players.add(newWinnerPlacement, winner);
		return;
	}
	
	
	
	public Iterable<String> standings() {
		return Collections.unmodifiableList(players);
	}
}
