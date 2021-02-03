package collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        print(al);
        ArrayList al2 = new ArrayList(al);
        al2.add("a");
        print(al2);
        al.addAll(0, al2);
        print(al);
        al.clear();
        print(al);
        ArrayList al3 = (ArrayList) al2.clone();
        print(al3);
        print(al3.contains(2));
        print(al3.get(2));
        print(al3.indexOf("a"));
        print(al3.isEmpty());
        Object[] arr = {1, "apple", 2, "apple", 3, 4, 5};
        al.addAll(Arrays.asList(arr));
        print(al);
        print(al.lastIndexOf("apple"));
        print(al.retainAll(Collections.singleton("apple")));
        print(al);
        al.removeAll(Collections.singleton("apple"));
        print(al);
        al3.set(1, "banana");
        print(al3);
        List al4 = al3.subList(1, 3);
        print(al4);
        Object[] array = al4.toArray();
        for (Object o: array) {
            print(o);
        }
    }

    static void print(Object o) {
        System.out.println(o);
    }
}

