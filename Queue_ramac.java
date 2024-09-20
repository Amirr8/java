

package queue_ramac;

import java.util.LinkedList;
import java.util.Queue;


public class Queue_ramac {

    
    public static void main(String[] args) {
      Queue<String> queue=new LinkedList<String>();
      int queueSize=7;
      queue.offer("cat");
      queue.offer("dog");
      queue.offer("elephant");
      queue.offer("monkey");
      queue.offer("bird");
      queue.offer("cow");
       
      queue.poll();
     
     System.out.println("element: " + (queue.isEmpty()?"queue is empty": queue.peek()));
              
     queue.add("goat");
     queue.add("zebra");
     System.out.println(queue);
     System.out.println("queue is " + (queue.size() >= queueSize ? "FULL":" NOT FULL"));
      
     queue.poll();
     queue.poll();
     
     
      System.out.println("queue is " + (queue.size() >= queueSize ? "Empty":" Not Empty"));
      System.out.println(queue);
    }
    
}
