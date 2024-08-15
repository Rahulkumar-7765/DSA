package com.jspiders;

public class DiagonalSum 
{
	public static void print(int arr[][])
    {
        int sum  = 0;
//        int sumL = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j)
                {
                    sum= sum + arr[i][j];
                   
                }
                
            }
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
		int [][] num = {{1,2,3},{4,5,6},{7,8,9}};
		print(num);
	}


}
