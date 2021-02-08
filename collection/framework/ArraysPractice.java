package collection.framework;

import java.util.*;

public class ArraysPractice {
    // Arrays에 정의된 메서드는 모두 static 메서드이다.

    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 3);
        System.out.println(Arrays.toString(arr));
        Arrays.setAll(arr, i -> (int) (Math.random() * 5) + 1);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {3, 5, 1, 6, 7};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int idx = Arrays.binarySearch(arr2, 6); // 배열이 정렬된 경우에만 사용 가능
        System.out.println(idx);

        int[][] arr3 = {arr, arr2};
        System.out.println(Arrays.deepToString(arr3));  // 다차원 배열 출력

        int[][] arr4 = arr3.clone();
        System.out.println(Arrays.deepEquals(arr3, arr4));

        List list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list.toString());

        List list2 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        list2.add(6);
        System.out.println(list2.toString());

        for (int i : arr2) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }
    }
}
