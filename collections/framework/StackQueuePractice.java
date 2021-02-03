package collections.framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueuePractice {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("a");
        st.push("b");
        st.push("c");
        print(st);
        print(st.peek());
        print(st.search("b"));
        print("============");
        Queue q = new LinkedList();
        q.add(0);
        q.offer(1);
        q.offer(2);
        while(!q.isEmpty()) {
            print(q.remove());
        }
    }
    static void print(Object o) {
        System.out.println(o);
    }
}
