
package stack_ramac;

import java.util.Stack;


public class Stack_Ramac {

    
    public static void main(String[] args) {
       Stack<String> stack = new Stack<>();
       int maximumSize=5;
     
 
       System.out.println("Stack is " + (stack.size() >= maximumSize ? "MAX":" NOT MAX"));
       stack.push("Apple");
       stack.push("Banana");
       stack.push("Cherry");
       stack.push("Date");
       stack.push("Elderberry");
       
       System.out.println("Top element is: " + (stack.isEmpty()?"Stack is empty": stack.peek()));
       
       String elementToSearch="Banana";
       int position=stack.search(elementToSearch);
       System.out.println("Element \""+elementToSearch + "\" position " + (position > 0? position :"not found"));
       
       String elementToSearch2="Grape";
       int position2=stack.search(elementToSearch2);
       System.out.println("Element \""+elementToSearch2 + "\" position " + (position2 > 0? position2 :"not found"));
       
       
       System.out.println("popped Elelment " + (stack.isEmpty()? " is empty" : stack.pop()));
       System.out.println("popped Elelment " + (stack.isEmpty()? " is empty" : stack.pop()));
       System.out.println("popped Elelment " + (stack.isEmpty()? " is empty" : stack.pop()));
       System.out.println("popped Elelment " + (stack.isEmpty()? " is empty" : stack.pop()));
       System.out.println("popped Elelment " + (stack.isEmpty()? " is empty" : stack.pop()));
       System.out.println("popped Elelment " + (stack.isEmpty()? " is empty" : stack.pop()));
       
       
    }
    
}
