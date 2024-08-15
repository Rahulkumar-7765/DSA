package queueOperations;

import java.util.Queue;

public class User {

	   public static void main(String[] args)
	   {
	       MyQueue q1=new MyQueue(5);
	       q1.enQueue(10);
	       q1.enQueue(20);
	       q1.enQueue(30);
	       q1.enQueue(40);
	       q1.enQueue(50);
//	       q1.enQueue(60);
	       q1.deQueue();
	       q1.deQueue();
	       q1.deQueue();
	       q1.deQueue();
	       q1.deQueue();
//	       q1.enQueue(60);
//	       q1.enQueue(70);
	       
	       q1.display();
	       System.out.println("peek"+q1.peek());
//	       System.out.println("peek"+q1.peek());
	       System.out.println("front: "+q1.front);
	       System.out.println("Rear: "+q1.rear);
	       System.out.println("capacity: "+q1.capacity());
	       System.out.println("size: "+q1.size());
	       System.out.println("is it empty: "+q1.isEmpty());
	       System.out.println("is it full: "+q1.isFull());

	   }

	}

