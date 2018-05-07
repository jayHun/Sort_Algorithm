package algo;

public class Testing{
	
	public static void showOrigin(int[] arr){
		System.out.print("원시 배열: ");
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
		System.out.println("===== 선택정렬 =====");
		showOrigin(arr);
		s.selectSort(arr);
		
		System.out.println("\n===== 버블정렬 =====");
		showOrigin(arr2);
		s.bubbleSort(arr2);
		
		System.out.println("\n===== 삽입정렬 =====");
		showOrigin(arr3);
		s.insertSort(arr3);
	}
}
