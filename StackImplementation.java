package stackimplementation;
import java.util.Stack;
public class StackImplementation {
public static void main(String[] args) {
      Stack<String> stack = new Stack<>();
       
       stack.push("Cellphone");
       stack.push("Laptop");
       
       System.out.println("Pushed\"Cellphone\"");
       System.out.println("Pushed\"Laptop\"");
       
       System.out.println("Top element is: " + (stack.isEmpty()?"Stack is empty": stack.peek()));
       
       String elementToSearch="Cellphone";
       int position=stack.search(elementToSearch);
       System.out.println("Element \""+elementToSearch + "\" found at position " + (position > 0? position-1:"not found"));
       
       System.out.println("Stack is" + (stack.isEmpty()?"empty":" not empty"));
       
       int maxSize=5;
       System.out.println("Stack is" + (stack.size()>=maxSize?"full":" not full"));
}

}
