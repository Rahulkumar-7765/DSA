package linearSearchOperations;

import java.util.Arrays;

public class Binraysearch 
{
	public static int BinarySearch(int[] num,int key) {
		int left=0;
		int right=num.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(num[mid]==key) {
				return mid;
			}
			else if(num[mid]>key) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] array= {1,2,3,4,5,6,7,8,};
		int key=8;
		Arrays.sort(array);
		int result=BinarySearch(array,key);
		if(result==-1) {
			System.out.println("element not found in the array");
		}
		else {
			System.out.println("element found at index:"+result);
		}
		
	}

}
