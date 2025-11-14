package _12_Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack; 
class Interleave {
    public static void interLeave(Queue<Integer> q) {
       Queue<Integer> firstHalf = new LinkedList<>();
       int size = q.size();
       for(int i=0; i<size/2; i++){
           firstHalf.add(q.remove());
       }
       while (!firstHalf.isEmpty()) {
           q.add(firstHalf.remove());
           q.add(q.remove());
        
       }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("Original Queue: " + q);
        interLeave(q);
        System.out.println("Interleaved Queue: " + q);
    }
}
