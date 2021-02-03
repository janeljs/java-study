package collections.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class IteratorPractice {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5};
        ArrayList list = new ArrayList(Arrays.asList(arr));

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(list);
    }
}
