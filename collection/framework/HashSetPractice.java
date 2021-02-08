package collection.framework;

import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; set.size() < 10; i++) {
            int num = (int) (Math.random() * 95) + 1;
            set.add(new Integer(num));
        }

        List<Integer> list = new LinkedList<Integer>(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
