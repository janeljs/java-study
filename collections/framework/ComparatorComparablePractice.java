package collections.framework;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorComparablePractice {
    // Comparable: 기본 정렬기준을 구현하는데 사용
    // Comparator: 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
    public static void main(String[] args) {
        String[] arr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(arr); // String의 comparable 구현에 의해 정렬
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Descending()); // 지정한 Comparator에 의한 정렬
        System.out.println(Arrays.toString(arr));
    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}