import java.util.*; 
public class Deque_Ex { 
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>(); 
       
        deque.add("Apple");           //add ()
        deque.addFirst("Fruit");      //addFirst ()
        deque.addLast("is");     //addLast ()
	System.out.println("Initial Deque:");
        System.out.print(deque + " "); 
        deque.push("A");         //push ()
        deque.offer("Good");        //offer ()
        deque.offerFirst("Daily");    //offerFirst ()
        deque.offerLast("for Health");   //offerLast ()
        System.out.println(" \nDeque:");
        System.out.print(deque + " ");  
 
        
         // Pop () method 
        System.out.println("\nDeque Pop:" + deque.pop()); 
        System.out.println("\nDeque,After pop:" + deque); 
           
        deque.removeFirst();        //removeFirst () 
        deque.removeLast();         //removeLast ()
        System.out.println("\nDeque, after removing "  + "first and last elements: " + deque); 
   } 
}