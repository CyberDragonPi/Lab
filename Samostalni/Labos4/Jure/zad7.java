package hr.fer.oop.samostalni4.zad7;


import java.util.*;
class LabTask {
    public static Map<Integer, Set<String>> underpayed(Map<String, Map<Integer, List<Integer>>> salaries) {
        Map<String, Map<Integer, Integer>> averageWorkerSalary = new HashMap<>();
        Map<Integer, Integer> averageSalary = new HashMap<>();
        Map<Integer, Integer> workersInYear = new HashMap<>();
        Map<Integer, Set<String>> underPayed = new HashMap<>();

        for (String worker : salaries.keySet()) {
            Map<Integer, List<Integer>> oneWorker = salaries.get(worker);
            //System.out.println(worker + " " + oneWorker);

            for (Integer year : oneWorker.keySet()) {
                Integer yearlySum = 0;
                //System.out.println(year);

                for(Integer month : oneWorker.get(year)) {
                    yearlySum += month;
                    //System.out.print(month + " ");
                }
                //System.out.println();
                if (averageSalary.containsKey(year) == false) {
                    averageSalary.put(year, yearlySum / 12);
                    workersInYear.put(year, 1);

                    if (averageWorkerSalary.containsKey(worker)) {
                        Map<Integer, Integer> currentWorker = averageWorkerSalary.get(worker);
                        currentWorker.put(year, yearlySum / 12);
                        averageWorkerSalary.put(worker, currentWorker);
                    } else {
                        Map<Integer, Integer> currentWorker = new HashMap<>();
                        currentWorker.put(year, yearlySum / 12);
                        averageWorkerSalary.put(worker, currentWorker);
                    }
                } else {
                    Integer currentAverage = averageSalary.get(year);
                    Integer currentWorkers = workersInYear.get(year);
                    averageSalary.put(year, currentAverage + yearlySum / 12);
                    workersInYear.put(year, currentWorkers + 1);

                    if (averageWorkerSalary.containsKey(worker)) {
                        Map<Integer, Integer> currentWorker = averageWorkerSalary.get(worker);
                        currentWorker.put(year, yearlySum / 12);
                        averageWorkerSalary.put(worker, currentWorker);
                    } else {
                        Map<Integer, Integer> currentWorker = new HashMap<>();
                        currentWorker.put(year, yearlySum / 12);
                        averageWorkerSalary.put(worker, currentWorker);
                    }
                }
            }
        }
        //System.out.println(averageSalary);
        //System.out.println(workersInYear);

        for (Integer year : averageSalary.keySet()) {
            averageSalary.put(year, averageSalary.get(year) / workersInYear.get(year));
        }
        //System.out.println(averageSalary);
        //System.out.println(workersInYear);
        //System.out.println(averageWorkerSalary);

        for (String worker : averageWorkerSalary.keySet()) {
            Map<Integer, Integer> currentWorker = averageWorkerSalary.get(worker);
            for (Integer year : currentWorker.keySet()) {
                if (currentWorker.get(year) < 0.7 * averageSalary.get(year)) {
                    if (underPayed.containsKey(year)) {
                        Map<Integer, Set<String>> currentYear = new HashMap<>();
                        Set<String> newSet = underPayed.get(year);
                        newSet.add(worker);
                        underPayed.put(year, newSet);
                    } else {
                        Set<String> newSet = new HashSet<>();
                        newSet.add(worker);
                        underPayed.put(year, newSet);
                    }
                }
            }
        }
        return underPayed;
    }
}
