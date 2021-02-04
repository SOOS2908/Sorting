import java.util.Scanner;
public class NewSort {
	public static void insertionSort(int array[]) {  
		int n = array.length;  
		for (int j = 1; j < n; j++) {  
			int key = array[j];  
			int i = j-1;  
			while ( (i > -1) && ( array [i] > key ) ) {  
				array [i+1] = array [i];  
				i--;  
			}  
			array[i+1] = key;  
		}  
	}
		   
	public static void main(String a[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n;
		n=input.nextInt();
		int[] arr=new int[n]; //{9,14,3,2,43,11,58,22};    
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.print("Before Insertion Sort: ");    
		for(int i:arr){    
			System.out.print(i+" ");    
		}
		insertionSort(arr);     
		System.out.print("\nAfter Insertion Sort:  ");    
		for(int i:arr){    
			System.out.print(i+" ");    
		}    
	}
}
