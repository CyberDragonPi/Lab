package hr.fer.oop.samostalni4.zad6;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.*;
import java.util.List;

public class Solution implements StudentScoreStatistics {
    private Map<String, List<Integer>> students = new LinkedHashMap<>();
    @Override
    public void addStudentScores(String student, Integer... scores) {
        if (students.containsKey(student)) {
            LinkedList<Integer> ocjene = new LinkedList<>(students.get(student));
            ocjene.addAll(Arrays.asList(scores));
        } else {
            students.put(student,Arrays.asList(scores));
        }
    }

    @Override
    public Collection<String> getInsertionOrderedStudents() {
        if (!students.isEmpty()) return (Collection<String>) students.keySet();
        return (Collection<String>) new LinkedList<String>();
    }

    @Override
    public Collection<Integer> getNaturallySortedPointsForStudent(String student) {
        if (students.get(student)== null) return null;
        LinkedList<Integer> grades = new LinkedList<>(students.get(student));
        grades.sort(Comparator.naturalOrder());
        return grades;
    }
}
