package collection.framework;

import java.util.*;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("a");
        set.add("a");
        set.add("v");
        set.add("x");
        set.add("x");
        set.add("e");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
