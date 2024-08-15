package com.recursion;

public class CountEven 
{
	public static int CountEven(int n) 
	{
		if(n==0) {
			return 0;
		}
	else if(n%2==0) {
		return n%10+CountEven(n/10);
		}
		return CountEven(n/10);
	}
	public static void main(String[] args) {
		System.out.println(CountEven(123));
	}

}
