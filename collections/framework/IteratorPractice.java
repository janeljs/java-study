package collections.framework;

import java.util.*;


public class IteratorPractice {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5};
        ArrayList list = new ArrayList(Arrays.asList(arr));

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(list);

        Map map = new HashMap();
        map.put(1, "a");
        map.put(2, "b");
        map.put(5, "e");
        System.out.println(map);
        Iterator mapit = map.entrySet().iterator();
        while (mapit.hasNext()) {
            System.out.println(mapit.next());
        }
    }
}
