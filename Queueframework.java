package _12_Queue;
import java.util.*;

public class Queueframework {

    public static void main(String[] args) {
        // Queue is an interface, implemented by LinkedList or ArrayDeque
        Queue<Integer> q = new LinkedList<>(); // or: Queue<Integer> q = new ArrayDeque<>();
        
        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Processing elements in the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // view the front element
            q.remove();                   // remove the front element
        }
    }
}
