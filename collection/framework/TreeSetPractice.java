package collection.framework;

import java.util.*;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 90, 50, 35, 45, 65, 10, 100};
        for (int i : score) {
            set.add(i);
        }
        System.out.println(set.headSet(50));
        System.out.println(set.tailSet(50));
        System.out.println(set.subSet(20, 70));
    }
}
