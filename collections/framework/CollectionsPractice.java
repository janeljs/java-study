package collections.framework;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        List list = new ArrayList();

        addAll(list, 1, 2, 3, 4, 5);
        print(list);
        rotate(list, 3);
        print(list);
        swap(list, 0, 2);
        print(list);
        shuffle(list);
        print(list);
        sort(list, reverseOrder());
        print("min=" + max(list, reverseOrder()));
        fill(list, 3);
        print(list);
        List newList = nCopies(list.size(), 2);
        print(newList);
        print(disjoint(list, newList)); // 공통요소가 없으면 true

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);
        print(list2);
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
}
