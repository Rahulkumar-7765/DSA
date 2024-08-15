package linkedlistoperations;

public class MyLinkedList 
{
	 Node head;
	 
	 // Add METHOD
	 
	 public int add(int data) 
	 {
		 Node newNode=new Node(data);
		 if(head==null) 
		 {
			 head=newNode;
			 return data;
			 
		 }
		 Node temp=head;
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=newNode;
		 return data;
	}
	 
	 // ADD FRONT METHOD//
	 
	 public int addFront(int data) {
		 Node newNode= new Node(data);
		 if(head==null) {
			 head=newNode;
			 return data;
		 }
		 newNode.next=head;
		 head=newNode;
		 return data;
	 }
	 
	 // add(int index,int data//
	 
	 public int add(int index,int data ) 
	 {
		 Node newNode=new Node(data);
		 if(index<0) { //work for index below
			 throw new IndexOutOfBoundsException("Invalid index,index cannot be -ve:"+index);
		}
		 else if(head==null) { // work for request of add without single element ex add(2,30)-->30
		 }
		 else if(index==0) { //add element in non empty list as first element
			 newNode.next=head;
			 head=newNode;
		 }
		 else { // handling all valid index size
			 Node temp=head;
			 int c=0;
			 while(c<index-1) {
				 c++;
				 if(c==size()) {
					 temp.next=newNode;
					 return data;
				 }
				 temp=temp.next;
			 }
			 newNode.next=temp.next;
			 temp.next=newNode;
		 }
		 return data;
	 }
	 
	 //REMOVEFIRST//
	 public int removeFirst() {
		 if(head==null) {
			 throw new NullPointerException("Empty List");
		 }
		 int res=head.data;
		 Node temp=head;
		 head=head.next;
		 temp=null;
		 return res;
	 }
	 
	 //REMOVELAST//
	 public int removeLast() {
		 int res = 0;
	        if (head == null) {
	        	throw new NullPointerException("Empty List");
	            
	        }
	        if (head.next == null) {
	            head = null;
	        } else {
	            Node temp = head;
	            while (temp.next.next != null) {
	                temp = temp.next;
	            }
	            temp.next = null;
	        }
			return res;
	    }
	 
	 //REMOVE//
	 public int remove() {
		 int res;
	        if (head == null) {
	        	throw new NullPointerException("Empty List");
//	            System.out.println("List is empty.");
	            
	        }
	        if (head.next==null) {
	        	res=head.data;
	        	return res;
//	            head = head.next;
	            
	        }
	        Node temp = head;
	        while (temp.next.next!=null) {
	        	temp=temp.next;
	            
	        }
	        res=temp.next.data;
	        temp.next=null;
	        return res;
//			return index;
	    }

	 
		 // FINDLAST METHOD
	 public int FindLast() 
	 {
		 if(head==null) {
//			 return -1;
			 throw new NullPointerException("LinkedList is Empty");
		 }
		 Node temp=head;
		 while(temp.next!=null) 
		 {
			 temp=temp.next;
		 }
		 return temp.data;
		 
	 }
	
	public void display() {
//		System.out.println("Started");
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
//		System.out.println("Ended");
	}
	// CHECK SIZE
	public int size() {
		Node temp=head;
		int c=0;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	
}
