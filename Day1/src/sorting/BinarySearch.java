package sorting;

import java.util.Scanner;

public class BinarySearch {
	public static int BinarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;

		while ((arr[mid] != key) && (low < high)) {
			if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;

			mid = (low + high) / 2;
		}
		if (arr[mid] == key)
			return mid;
		else
			return -999;
	}
	
	public static void main(String[] args) {

		int arr[] = { 2, 9, 75, 6, 5, 65, 213, 2125, 225, 3 };

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter key :- ");
		int key = sc.nextInt();
		
		int i = BinarySearch(arr,key);

		System.out.println("Position of the element is " + i);
	}
}
