package linearSearchOperations;

import java.util.Scanner;
public class SelectionSort{

public static int[] sort1(int[] num)
{
    System.out.println("sort1 with one swap per each pass");
    int c=0;
    for(int i=0;i<=num.length-1;i++)//0 to n-2
    {
        int min=i;
        for(int j=i+1;j<=num.length-1;j++)
        {
            if(num[j]<num[min])
            {
            min=j;
            }
        }
        if(i!=min)
        {
        c++;
        int temp=num[i];
        num[i]=num[min];
        num[min]=temp;
        }
        //System.out.print(num[i]+" ");
    }
    System.out.println("total swap: "+c);
        for(int i=0;i<=num.length-1;i++)
        {
            System.out.print(num[i]+" ");
        }
        return num;
}
public static int[] sort2(int[] num)
{
    System.out.println("sort2 with one swap per each iteration");
    int c=0;
    for(int i=0;i<=num.length-1;i++)//0 to n-2
    {
        for(int j=i+1;j<=num.length-1;j++)
        {
            if(num[i]>num[j])
            {
                c++;
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
       
        //System.out.print(num[i]+" ");
    }
    System.out.println("total swap: "+c);
        for(int i=0;i<=num.length-1;i++)
        {
            System.out.print(num[i]+" ");
        }
        return num;
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    int[] num1 = new int[n];
    System.out.println("Enter elements");
    for (int i = 0; i <= n - 1; i++) {
        num1[i] = sc.nextInt();
    }
    int[] num2=num1;
    sort1(num1);
    //sort1(num1);
    sort2(num2);
    sc.close();

}

}
//	public static void printArray(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
//	}
//	public static void main(String[] args) {
//		int arr[]= {7,8,3,2,1};
//		//selection sort
//		for(int i=0;i<arr.length-1;i++) {
//			int smallest=i;
//			for(int j=i+1; j<arr.length;j++) 
//			{
//				if(arr[smallest]>arr[j]) {
//					smallest=j;
//				}
//				
//			}
//			int temp=arr[smallest];
//			arr[smallest]=arr[i];
//			arr[i]=temp;
//		}
//		
//		printArray(arr);
//	}
//
//}
//	public static int[] sort(int[] num) {
//	for(int i=0;i<=num.length-2;i++) {
//		for(int j=i+1;j<=num.length-1;j++) {
//			if(num[i]>num[j]) {
//				int temp=num[i];
//				num[i]=num[j];
//				num[j]=temp;
//			}
//		}
//		
//	}
//	for(int i=0; i<num.length-1;i++) {
//		System.out.println(num[i]+" ");
//	}
//	return num;
//	}
//	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Size");
//	int n=sc.nextInt();
//	int[] num=new int[n];
//	System.out.println("Enter Elements");
//	for(int i=0;i<=n-1;i++) {
//		num[i]=sc.nextInt();
//	}
//	sort(num);
//	sc.close();
////	System.out.println("Enter element");
////	int key=sc.nextInt();
////	sort(num);
////	sc.close();
//	}

