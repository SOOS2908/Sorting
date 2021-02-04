import java.util.Scanner;  

public class BubbleSort {
	static void bubbleSort(int[] arr,int n) {  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  
			}  
		}    
	}  
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);  
	    System.out.print("Enter size of array: ");
	    int n = input.nextInt(); 
		int arr[]=new int[n]; 
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.print("Array Before Bubble Sort: ");  
		for(int i=0; i < n; i++){  
			System.out.print(arr[i] + " ");  
		}  
		System.out.println();  
		  
		bubbleSort(arr,n);
		 
		System.out.print("Array After Bubble Sort:  ");  
		for(int i=0; i < n; i++){  
			System.out.print(arr[i] + " ");  
		}  
	}  
}
