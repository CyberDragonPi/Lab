package task7;

public class main {

	public static void main(String[] args) {
		Solution stat = new Solution();
		stat.addStudentScores("Luka", 4, 1, 2);
		stat.addStudentScores("Luka", 1, 4);
		stat.addStudentScores("Jovan deretic" , -4 , 3, 7, 8);
		stat.addStudentScores("Febo", 5, 2, 3, 4, 5);

		
		System.out.println(stat.getNaturallySortedPointsForStudent("Luka"));
		System.out.println(stat.getInsertionOrderedStudents());
	}
}
