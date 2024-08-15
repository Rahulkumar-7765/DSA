package com.jsp.DSAApp;
import java.util.Arrays;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int []array= {3,6,8,12,14,17,25};
		int key=17;
		Arrays.parallelSort(array);
		int result=binarysearch(array,key);
		if(result==-1) {
			System.out.println("element not found in the array");
		}else {
			System.out.println("element found at index:"+result);
		}
	}

	private static int binarysearch(int[] array, int key) 
	{
		int left=0;
		int right=array.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(array[mid]==key) {
				return mid;
			}
			if(array[mid]<key) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

}
