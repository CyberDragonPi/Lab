package task7;

import java.util.*;

interface StudentScoreStatistics {
void addStudentScores(String student, Integer... scores);
    
    /**
     * @return Vraca kolekciju zabiljezenih studenata prema redoslijedu dodavanja. Vraca praznu kolekciju ako nema zabiljezenih studenata.
     */
    Collection<String> getInsertionOrderedStudents();
    
    /**
     * 
     * @param student
     * @return vraca bodove za studenta, sortirane prema prirodnom poretku. Ako nema studenta metoda vraca null.
     */
    Collection<Integer> getNaturallySortedPointsForStudent(String student);
}
