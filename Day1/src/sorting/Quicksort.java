package sorting;

public class Quicksort {
	public static int partition (int arr[], int low, int high)
	{
		int left,right,pivot,t;
		
		pivot = arr[low];
		left = low;
		right = high;
		
		while (left<= right)
		{
			while((arr[left]<=pivot) && (left<high))
				left++;
			
			while (arr[right]>pivot)
				right--;
			
			if(left<right)
			{
				t=arr[left];
				arr[left] = arr[right];
				arr[right]=t;
				left++;
				right--;
			}
			else
				left++;	
		}
	
	arr[low] = arr[right];
	arr[right]= pivot;
	return right;
	}
	
	public static void QuickSort(int arr[],int low , int high )
	{
		int pivloc;
		if(low>=high)
			return;
		pivloc =partition(arr, low, high);
		QuickSort(arr,low,pivloc-1);
		QuickSort(arr, pivloc-1, high);
	}
	
	public static void main(String[] args) {
		Quicksort obj = new Quicksort();
		int arr[] = { 15, 54, 5, 84, 52, 78, 44, 2, 5, 45, 6, 55, 5 };
		
		obj.QuickSort(arr,0,12);
		
		System.out.println(arr);
	}
}
