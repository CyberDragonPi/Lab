package task5;

import java.util.*;

class main {

	public static void main(String[] args) {
		Map<String, Map<Integer, List<Integer>>> salaries = new HashMap<>();
		Map<Integer, List<Integer>> worker1 = new HashMap<>();
		worker1.put(2011, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12));
		worker1.put(2012, Arrays.asList(1, 2, 3, 4, 5, 80, 7, 8, 9, 10 , 11, 35));
		
		Map<Integer, List<Integer>> worker2 = new HashMap<>();
		worker2.put(2010, Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, 9, 10 , 11, 56));
		worker2.put(2012, Arrays.asList(1, 33, 76, 4, 5, 80, 7, 8, 760, 10 , 11, 35));
		salaries.put("Pero", worker1);
		salaries.put("Febo", worker2);
		
		Map<Integer, Set<String>> underpayed = LabTask.underpayed(salaries);
		System.out.println(underpayed);
	}

}
