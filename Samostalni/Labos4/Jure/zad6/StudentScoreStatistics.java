package hr.fer.oop.samostalni4.zad6;

import java.util.Collection;

public interface StudentScoreStatistics {
    public void addStudentScores(String student, Integer... scores);
    public Collection<String> getInsertionOrderedStudents();
    public Collection<Integer> getNaturallySortedPointsForStudent(String student);
}
