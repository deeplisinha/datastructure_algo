public class BubbleSort{

	public static void main(String[]args) {
		int[]arr= {2,8,9,6,4,5,1,3};
		for(int i=arr.length-1;i>1;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	
	}
}