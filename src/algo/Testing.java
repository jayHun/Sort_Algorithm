package algo;

public class Testing{
	
	public static void showOrigin(int[] arr){
		System.out.print("원시 배열: ");
		for(int value:arr){
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
	public static void showSorted(int[] arr){
		System.out.print("최종 배열: ");
		for(int value:arr){
			System.out.print(value + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{68, 9, 32, 2, 14, 7, 31, 26, 27, 53};
		int[] arr2 = arr.clone();
		int[] arr3 = arr2.clone();
		int[] arr4 = arr3.clone();
				
		Algorithm s = new Algorithm();
		System.out.println("===== 선택정렬 =====");
		showOrigin(arr);
		s.selectSort(arr);
		showSorted(arr);
		
		System.out.println("\n===== 버블정렬 =====");
		showOrigin(arr2);
		s.bubbleSort(arr2);
		showSorted(arr2);
		
		System.out.println("\n===== 삽입정렬 =====");
		showOrigin(arr3);
		s.insertSort(arr3);
		showSorted(arr3);
		
		System.out.println("\n===== 합병(병합)정렬 =====");
		showOrigin(arr4);
		int[] arr5=s.mergeSort(arr4).clone();
		showSorted(arr5);
	}
}
