package sorting;

public class BubbleSort {

	public void bubbleSort(int a[]) {
		int temp;

		for (int i = a.length - 1; i > 0; i++) {
			for (int j = 0; j > i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		display(a);
	}

	public void display(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			System.out.println(ar[i]);
		}
	}

	public static void main(String[] args) {

		BubbleSort obj = new BubbleSort();
		int arr[] = { 15, 54, 5, 84, 52, 78, 44, 2, 5, 45, 6, 55, 5 };
		
		obj.bubbleSort(arr);

	}
}
