/**
  * Generic Queue example
  * Mutable Version, without specifications
  * SWE/CS 332
  * @author Paul Ammann
  */

import java.util.*;

public class Queue <E> {

   private List<E> elements;
   private int size;

   public Queue() {   
      this.elements = new ArrayList<E>();
      this.size = 0;
   }
   
   public Queue(ArrayList<E> elements)
   {
	   this.elements = elements;
	   this.size = elements.size();
   }

   public Queue<E> enQueue (E e) {
     elements.add(e);
     ArrayList<E> al = new ArrayList<E>();
     for(E item:elements)
    	 al.add(item);
     al.add(e);
     return new Queue<E>(al);
   }

   public Queue<E> deQueue () {
     if (size == 0) throw new IllegalStateException("Queue.deQueue");
     Queue<E> tmp = new Queue<E>();
     for(int i = 1; i <= size; i++)
    	 tmp = tmp.enQueue(elements.get(i));
     return tmp;
   }
   
   public E peek() {
	   return elements.get(0);
   }

   public boolean isEmpty() {
      return size == 0;
   }

  public static void main(String[] args) {
     // Simple exercise to enQueue/deQueue cmd line args
     // Usage:  java Queue item1 item2 item3 ...
     Queue <String> q = new Queue <String>();
     for (String arg : args)
        q.enQueue(arg);
     while (!q.isEmpty() )
     {
        System.out.println(q.peek());
        q = q.deQueue();
     }

  }

}