package stackOperationsusingLinkedList;

import java.util.EmptyStackException;

public class MyStackLs 
{
	public class MyStack {
	    private Node top;
	    private int size;
	   
	    public int push(int data)
	    {
	        Node newNode=new Node(data);
	        if(newNode==null)
	        {
	            System.out.println("heap is full");
	        }
	        else if(top==null)
	        {
	            top=newNode;
	        }
	        else
	        {
	            newNode.next=top;
	            top=newNode;
	        }
	        size++;
	        return data;
	    }
	    public int pop()
	    {
	        int res;
	        if(top==null)
	        {
	            throw new EmptyStackException();
	        }
	        else
	        {
	            size--;
	            res=top.data;
	            top=top.next;
	        }
	        return res;
	    }
	    public int peek()
	    {
	        if(top==null)
	        {
	            throw new EmptyStackException();
	        }
	        return top.data;
	    }
	    public boolean isEmpty()
	    {
	        return top==null;
	    }
	   
	    public int size()
	    {
	        return size;
	    }
	    @Override
	    public String toString() {
	       if(top==null)
	       {
	           return "[]";
	       }
	       String res="[";
	       Node temp=top;
	       while(temp!=null)
	       {
	           res=res+temp.data+", ";
	           temp=temp.next;
	       }
	       //res=res+"]";
	       res=res.substring(0,res.length()-2)+"]";
	       return res;
	       
	    }

	   }

}
