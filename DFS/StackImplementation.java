import java.util.*;
import static java.lang.System.exit;

class StackImplementation{
      //a linked list Node 
      private class Node {
        int data; //integer data
        Node link; //reference to variable Node
    }

    //create top Node variable
    Node top;
    //constructor
    StackImplementation() {
        this.top = null;
    }

    //function to add an element x in the stack 
    public void push(int x) //insert at the beginning 
    {
        //create new node temp and allocate memory
        Node temp = new Node();

        //make sure stack isn't full to prevent stack overflow
        if (temp == null) {
            System.out.println("Heap Overflow");
            return;
        }

        //initialize data into temp data field 
        temp.data= x; 
        //put top reference into temp link
        temp.link = top;
        //update top reference
        top = temp;
    }

    //utility function to check if stack if empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    //utility function to return top element in a stack 
    public int peek()
    {
        //check if empty stack
        if(!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //pop element from the stack
    public void pop() //remove at the beginning 
    {
        //check if stack underflow
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        //update top pointer to the next node 
        top = (top).link;
    }

    public void display() 
    {
        //check for stack underflow
        if (top == null) {
            System.out.println("Stack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                //print node data
                System.out.printf("%d->", temp.data);

                //assign temp link to temp
                temp = temp.link;
            }
        }
    }
}
//driver code
public class GFG { 
    public static void main(String[] args) 
    { 
        // create Object of Implementing class 
        StackImplementation obj = new StackImplementation(); 
        // insert Stack value 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        // print Stack elements 
        obj.display(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
  
        // Delete top element of Stack 
        obj.pop(); 
        obj.pop(); 
  
        // print Stack elements 
        obj.display(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    } 
} 

