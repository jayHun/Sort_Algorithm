package algo;

public class Testing{
	
	public static void showOrigin(int[] arr){
		System.out.print("���� �迭: ");
		for(int value:arr){
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{68, 9, 32, 2, 14, 7, 31, 26};
		int[] arr2 = arr.clone();
		int[] arr3 = arr2.clone();
		
		Algorithm s = new Algorithm();
		System.out.println("===== �������� =====");
		showOrigin(arr);
		s.selectSort(arr);
		
		System.out.println("\n===== �������� =====");
		showOrigin(arr2);
		s.bubbleSort(arr2);
		
		System.out.println("\n===== �������� =====");
		showOrigin(arr3);
		s.insertSort(arr3);
	}
}
