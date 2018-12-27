public class SelectionSort {

	public static void main(String []args) {
		int[]arr= {11,3,49,7,8,2,5};
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					int temp=arr[i];
					arr[i]=min;
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}