package collections.framework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class HistoryQueue {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 6;

    public static void save(String input) {
        if (!input.equals("")) {
            q.offer(input);
        }
        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }

    public static void main(String[] args) {
        print("도움말: help");

        while (true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim(); // trim: 왼쪽, 오른쪽 공백 제거

                if (input.equals("")) continue;
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    print("도움말: help");
                    print("종료: Q");
                    print("최근 명령어 조회: history");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext()) {
                        print(++i + "." + it.next());
                    }
                } else {
                    save(input);
                    print(input);
                }
            } catch (Exception e) {
                print("입력 오류");
            }
        }
    }

    static void print(Object o) {
        System.out.println(o);

    }
}
