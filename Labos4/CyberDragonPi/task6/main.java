package task6;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> mapa = new HashMap<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		
		for (int i = 0; i < 10; i++) {
			mapa.put(i + 4, i + 2);
		}
		
		System.out.println(LabTask.count(mapa, set));
	}
}
