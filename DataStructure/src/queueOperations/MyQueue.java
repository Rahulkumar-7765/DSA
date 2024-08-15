package queueOperations;

public class MyQueue 
{
	int front=-1;
	int rear=-1;
	int size;
	int[] num;

	public MyQueue(int n)
	{
	    this.num=new int[n];
	}

	public void enQueue(int data)
	{
//	    if(num.length-1==rear)
		if((rear+1)%num.length==front)
	    {
	        System.out.println("queue is full: ");
	    }
	    else if(front==-1 && rear==-1)
	    {
	        front++;
	        rear++;
	        num[rear]=data;
	        size++;
	    }
	    else
	    {
//	        rear++;
	    	rear=(rear+1)%num.length;
	        num[rear]=data;
	        size++;
	    }
	}
	public void display()
	{
	    for(int i=0;i<=num.length-1;i++)
	    {
	        System.out.print(num[i]+" ");
	    }
	    System.out.println();
	}
	public int peek() {
		if(front==-1&&rear==-1) {
			System.out.println("empty queue");
			return -1;
		}return num[front]; 
	}
	public int deQueue()
	{
	    int res=-1;
	    if(front==-1 && rear==-1)
//	    if((rear+1)%num.length==front)
	    {
	        System.out.println("queue is empty:");
	    }
	    else if(front==rear)
	    {
	        res=num[front];
	        num[front]=-1;
	        front=-1;
	        rear=-1;
	        size--;
	    }
	    else
	    {
	        res=num[front];
	        num[front]=-1;
	        front++;
	        size--;
	    }
	    return res;
	}
	public boolean isEmpty()
	{
	    if(front==-1 && rear==-1)
	    {
	        return true;
	    }
	    return false;
	}
	public boolean isFull()
	{
//	    if(front==0 && rear==num.length-1)
		if((rear+1)%num.length==front)
	    {
	        return true;
	    }
	    return false;
	}

	public int capacity()
	{
	    return num.length;
	}
	public int size()
	{
	    return size;
	}
}
