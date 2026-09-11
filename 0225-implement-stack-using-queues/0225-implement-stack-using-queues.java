import java.util.*;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
    }

    public void push(int x) {

        // New element ko q2 mein daalo
        q2.offer(x);

        // q1 ke saare elements q2 mein shift karo
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // q1 aur q2 swap
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}