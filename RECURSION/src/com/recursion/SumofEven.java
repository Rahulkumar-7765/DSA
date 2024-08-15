package com.recursion;

public class SumofEven
{
	public static int SumEven(int n) {
		if(n==0) {
			return 0;
		}
		else if((n%10)%2==0) {
			return n%10+SumEven(n/10);
		}
		else {
			return SumEven(n/10);
		}
	}
	public static void main(String[] args) {
		System.out.println(SumEven(123486));
	}

}
