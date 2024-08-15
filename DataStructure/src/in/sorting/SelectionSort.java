package in.sorting;

public class SelectionSort {

	public static void sort(int num[]) {
		
		for(int i = 0; i <num.length;i++) {
			int s ;
			for(int j = i+1 ; j<num.length;j++) {
				s = i;
				if(num[j]<num[s]) {
					num[i]=num[i]^num[j];
					num[j]=num[i]^num[j];
					num[i]=num[i]^num[j];
				}
			}
		}
	}
	public static void main(String[] args) {
		int num[] = {6,4,8,3,8,2};
		sort(num);
		
		for(int i = 0; i <num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
