package algo;

class Algorithm{
	
	// �ε����� ���ڷ� �Ͽ� �迭�� �ڸ��� ���� �ٲٴ� �޼ҵ�
	// Swap each two element in array
	
	public void swap(int[] arr, int idx1, int idx2){
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
	}
	
	// ��������(Selection_Sort)
	public void selectSort(int[] arr){
		int min_idx=0;
		for(int i=0; i<arr.length-1; i++){
			min_idx=i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[min_idx]){
					min_idx=j;
				}
			}
			swap(arr, i, min_idx);
			System.out.print("�������� " + (i+1) + "�ܰ� : ");
			for(int cnt:arr){
				System.out.print(cnt + " ");
			}
			System.out.println("");
		}
	}
	
	// ��������(Bubble_Sort)
	public void bubbleSort(int[] arr){
		boolean flag=true;
		int cnt=0;
		while(flag){
			flag=false;
			for(int i=0; i<arr.length-1; i++){
				if(arr[i]>arr[i+1]){
					swap(arr, i, i+1);
					flag=true;
				}
			}
			System.out.print("�������� " + ++cnt + "�ܰ� : ");
			for(int value:arr){
				System.out.print(value + " ");
			}
			System.out.println("");
		}
	}
	
	// ��������(Insertion_Sort) 
	public void insertSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int temp=arr[i];
			int j=i;
			while((j>0) && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
			System.out.print("�������� " + i + "�ܰ� : ");
			for(int value:arr){
				System.out.print(value + " ");
			}
			System.out.println("");
		}
	}
}