import java.util.*;

class LabTask {
	public static Set<String> theMostInformed(Map<String, Set<String>> map) {
		TreeSet <String> mostContacts = new TreeSet<>();
		Integer mostNumberOfContacts = -1;
		
		for (String person: map.keySet()) {
			if (map.get(person).size() > mostNumberOfContacts) {
				mostNumberOfContacts = map.get(person).size();
			}
		}
		
		for (String person : map.keySet()) {
			if (map.get(person).size() == mostNumberOfContacts) {
				mostContacts.add(person);
			}
		}
		return (Set<String>)mostContacts.descendingSet();
	}
}
