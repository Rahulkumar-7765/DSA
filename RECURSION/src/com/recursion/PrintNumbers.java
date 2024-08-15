package com.recursion;

public class PrintNumbers
{
	public static int countEven(int n) {
		if(n==0) {
			return 0;
		}
		else if((n%10)%2==0) {
//			return n%2+countEven(n/10);
			return 1+countEven(n/10);
		}
		else {
			return countEven(n/10);
		}
	}
	public static void main(String[] args) {
		System.out.println(countEven(3245));
	}

}
