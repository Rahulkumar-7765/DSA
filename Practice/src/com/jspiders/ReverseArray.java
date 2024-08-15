package com.jspiders;

public class ReverseArray 
{
	public static void reverse(int num[]) // method 1
    {
        int j=num.length-1;
        for (int i = 0; i <= (num.length-1)/2; i++)
         {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
             j--;
        }
        printarr(num);
        
    }

    public static void reverse1(int num[])
    {
        int i=0; int j=num.length-1;
        while(i<j)
        {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        printarr(num);
    }

    public static void printarr(int num[])
    {
        for (int i = 0; i <= num.length-1; i++) {
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        reverse1(arr);
    }

}
