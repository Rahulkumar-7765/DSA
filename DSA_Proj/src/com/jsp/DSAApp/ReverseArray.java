package com.jsp.DSAApp;

import java.util.Arrays;

public class ReverseArray 
{
	public static int[] reverse(int[]num) {
		if(i!=num.length-1-i) {
		for(int i=0;i<=(num.length-1)/2;i++){
			num[i]=num[i]^num[num.length-1-i];
			num[i]=num[1]^num[num.length-1-i];
			num[i]=num[i]^num[num.length-1-i];
			
			
		}
		System.out.println(Arrays.toString(num));
		return num;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5};
		reverse(num);
		
	}

}

