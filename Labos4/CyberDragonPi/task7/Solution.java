package task7;

import java.util.*;

class Solution implements StudentScoreStatistics{
	Map<String, List<Integer>> students = new LinkedHashMap<>();
	
	public Solution() {}


	public void addStudentScores(String student, Integer... scores) {
		if (this.students.containsKey(student)) {
			ArrayList <Integer> oldGrades = new ArrayList<>();
			for (Integer old : this.students.get(student)) {
				oldGrades.add(old);
			}
			for (Integer neue : scores) {
				oldGrades.add(neue);
			}
			
			students.put(student, oldGrades);
		} else {
			students.put(student, Arrays.asList(scores));
		}
	}


	public Collection<String> getInsertionOrderedStudents() {
		if (!this.students.isEmpty()) {
			return(Collection<String>) this.students.keySet();
		} else {
			return (Collection<String>) new LinkedList<String>();
		}
	}

	public Collection<Integer> getNaturallySortedPointsForStudent(String student) {
		LinkedList<Integer> grades = new LinkedList<>();
		
		if (this.students.containsKey(student)) {
			for (Integer integer : this.students.get(student)) {
				grades.add(integer);
			}
			grades.sort(Comparator.naturalOrder());
			//System.out.println(grades);
			return (Collection<Integer>)grades;
		} else {
			return null;
		}
	}
}
