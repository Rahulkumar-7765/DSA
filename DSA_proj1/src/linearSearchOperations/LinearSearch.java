package linearSearchOperations;

import java.util.Scanner;

public class LinearSearch 
{
	public static int find(int[]num,int key) {
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter Size");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<=num.length-1;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Enter int element to search");
		int key=sc.nextInt();
		System.out.println(find(num,key));
		}
		
	}

}
