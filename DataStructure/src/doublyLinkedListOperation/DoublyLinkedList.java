package doublyLinkedListOperation;

public class DoublyLinkedList {

	Node head;
	Node tail;
	
	public int add(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return data;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		tail=newNode;
		return data;
	}
	
	public int addFront(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return data;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		return data;
	}
	
	public void Forwardtraverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		System.out.println();
		
	}
	public void reversetraverse() {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
			
		}
		System.out.println();
		
	}

}
