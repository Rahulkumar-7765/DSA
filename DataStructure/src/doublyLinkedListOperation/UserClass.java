package doublyLinkedListOperation;

public class UserClass 
{
	public static void main(String[] args) {
		
	
//	Node n1=new Node(10);
//	Node n2=new Node(20);
//	Node n3=new Node(30);
//	Node n4=new Node(40);
//	
//	n1.next=n2;
//	n2.prev=n1;
//	
//	n2.next=n3;
//	n3.prev=n2;
//	
//	n3.next=n4;
//	n4.prev=n3;
//	
//	Node head=n1;
//	Node tail=n4;
	
	DoublyLinkedList d1=new DoublyLinkedList();
//	d1.head=head;
//	d1.tail=tail;
	
//	d1.add(80);
//	d1.add(90);
//	d1.add(100);
	
	d1.addFront(50);
	d1.addFront(60);
	d1.addFront(70);
	
	d1.Forwardtraverse();
	d1.reversetraverse();
	
	
	}
}
