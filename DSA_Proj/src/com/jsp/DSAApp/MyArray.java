package com.jsp.DSAApp;

public class MyArray 
{
	private int[] num;
	private int c;
	private int incr_capacity;
// -------------------------------------------------
//	Zero-parameterized-constructor	
	public MyArray()
	{
	    this.num= new int[10];
	}
	// -------------------------------------------------
//		Int-parameterized-constructor	
	public MyArray(int initial_cap)
	{
	    this.num= new int[initial_cap];
	}
// -------------------------------------------------
//		Int and incimintal_capacity-parameterized-constructor	
	public MyArray(int initial_cap,int incr_capacity)
	{
	    this.num= new int[initial_cap];
	    this.incr_capacity=incr_capacity;
	}
// -------------------------------------------------
//		Add-method	
	public void add(int data)
	{
	    if(c==num.length)
	    { 
	    	 int[] newArray;
	    	if(incr_capacity==0)
	    	{
	        newArray=new int[num.length+(int)(num.length*0.6f)];
	    	}
	    	else
	    	{
	    		newArray=new int[num.length+incr_capacity];
	    	}
	        for(int i=0;i<=num.length-1;i++)
	        {
	            newArray[i]=num[i];
	        }
	        
	        num=newArray;
	    }
	   
	    num[c]=data;
	   c++;
	}
// -------------------------------------------------
//	Add-element-at-front-method
	public void addFront(int data)
	{
	    if(c==num.length)
	    { 
	    	 int[] newArray;
	    	if(incr_capacity==0)
	    	{
	        newArray=new int[num.length+(int)(num.length*0.6f)];
	    	}
	    	else
	    	{
	    		newArray=new int[num.length+incr_capacity];
	    	}
	        for(int i=0;i<=num.length-1;i++)
	        {
	            newArray[i]=num[i];
	        }
	        
	        num=newArray;
	    }
	    for(int i=c;i>=1;i--)
	    {
	    	num[i]=num[i-1];
	    }
	    num[0]=data;
	   c++;
	}
// -------------------------------------------------
//		Add-element-at-Specific index	
	public void addAtIndex(int index,int data)
	{
	    if(c==num.length)
	    { 
	    	 int[] newArray;
	    	if(incr_capacity==0)
	    	{
	        newArray=new int[num.length+(int)(num.length*0.6f)];
	    	}
	    	else
	    	{
	    		newArray=new int[num.length+incr_capacity];
	    	}
	        for(int i=0;i<=num.length-1;i++)
	        {
	            newArray[i]=num[i];
	        }
	        
	        num=newArray;
	    }
	    if(index<0||index>c)
	    {
	    	throw new ArrayIndexOutOfBoundsException("Invalid index "+index);
	    }
	    for(int i=c;i>=index+1;i--)
	    {
	    	num[i]=num[i-1];
	    }
	    num[index]=data;
	   c++;
	}
// -------------------------------------------------
//	Display-method(it prints all array elemets)

	public void display()
	{
	    //System.out.println("hello");
	    for(int i=0;i<=c-1;i++)
	    {
	        System.out.print(num[i]+" ");
	    }
	    System.out.println();
	}
	public int size()
	{
	    return c;
	}
	public int capacity()
	{
	    return num.length;
	}
// -------------------------------------------------
//	bubble-sorting	
	public void sort()
	{
		for(int i=0;i<=c-1;i++)
		{
			for(int j=i+1;j<=c-1;j++)
			{
			if(num[i]>num[j])
			{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
			}
		}
	}
// -------------------------------------------------
//		bubble_sorting_reverse
		public void reverseSort()
		{
			for(int i=0;i<c;i++)
			{
				for(int j=i+1;j<=c-1;j++)
				{
				if(num[i]<num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				}
			}
		}
	
//---------linear_search---------------------------
	public boolean containce(int key)
	{
		for(int i=0;i<=c-1;i++)
		{
			if(num[i]==key)
			{
				return true;
			}
		}
		return false;
	}
	
//----binary-search-----------
	public boolean binarySearch(int key)
	{
//		MyArray m1=new MyArray();
//		m1.sort();
		
		int l=0,h=c;
		while(l<h)
		{
			int mid=(l+h)/2;
			if(num[mid]==key)
			{
				return true;
			}
			else if(num[mid]>key)
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		return false;
	}
	
// -------------------------------------------------
//	remove method
	public void remove() {
		if(size()==0)
		{
			System.err.println("List is empty...!");
		}
		else {
		c--;
		}
	}

// -------------------------------------------------
//remove-first method
		public void removeFirst() {
			if(size()==0)
			{
				System.err.println("List is empty...!");
			}
			else {
			for(int i=0;i<c;i++)
			{
				num[i]=num[i+1];
			}
			c--;
			}
		}

// -------------------------------------------------
//remove-first method
public void removeAt(int index) {
 if(size()==0)
  {
     System.err.println("List is empty...!");
    }
     else if(index<0||index>c)
     {
    	System.out.println("Invalid Index...."); 
     }
	else 
	{
     for(int i=index;i<c;i++)
    {
		num[i]=num[i+1];
	  }
	c--;
		}
	}

//---toString method---------------------------
	@Override
	public String toString() 
	{
		String res="[";
		if(c==0)
		{
			return res+"]";
		}
		for(int i=0;i<=c-1;i++)
		{
			res+=num[i]+", ";
		}
		res=res.substring(0, res.length()-2)+"]";
		return res;
			}
}

