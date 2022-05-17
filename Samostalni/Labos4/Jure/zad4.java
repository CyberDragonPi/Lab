package hr.fer.oop.samostalni4.zad4;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LabTask {
    public static int count(Map<Integer, Integer> map, Set<Integer> set) {
        int suma = 0;
        Set<Integer> pomocni = new HashSet<>();
        for (var broj : set) {
            if(map.containsValue(broj)) {
                suma++;
            }
        }
        return suma;
        }
}

