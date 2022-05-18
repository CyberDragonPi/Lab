package task6;

import java.util.*;

class LabTask {
	 public static int count(Map<Integer, Integer> map, Set<Integer> set) {
		 int numberOfEquals = 0;
		 
		 for (Integer integer: set) {
			 if (map.containsValue(integer)) {
				 numberOfEquals++;
			 }
		 }
		 return numberOfEquals;
	 }
}
