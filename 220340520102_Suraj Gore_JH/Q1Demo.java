import java.util.*;

class Q1{
	void insertionSort(int[] a,int n){
		
		for(int i=0;i<n-1;i++){
			int min = n-1;
			for(int j=n-1;j>0;j--){
				if(a[min] > a[j])
					min = j;
				else{
					
				}
			}
			int temp = a[min];
			a[min] = a[n-1];
			a[n-1] = temp;
		}
	}
	void print(int a[]){
		int n = a.length;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
class Q1Demo{
	public static void main(String[] args){
		Q1 q = new Q1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array;:");
		int n = sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter elements Of array:");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		q.insertionSort(a,n);
		q.print(a);
	}
}