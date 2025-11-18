package _12_Queue;
import java.util.Deque;
import java.util.LinkedList;
public class Queueusingdeque {
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            if(dq.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }
        public int peek(){
            if(dq.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove()); 
        System.out.println(q.peek());
        
    }
}
