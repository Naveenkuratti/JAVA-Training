package Programs;

public class AscendingOrder {
public static void main(String[] args) {
	
	
	int arr[]= {5,2,8,7,1};
	
	System.out.println("Original array:");
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]+" ");
		
		
		int temp=0;
		for(int i1=0; i1<arr.length; i1++) {
			for(int j=i1+1;j<arr.length;j++) {
				if(arr[j] < arr[i1 ]) {
					temp=arr[i1] ;
					arr[i1]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("sorted array:");
		for(int i1=0; i1<arr.length; i1++) {
			System.out.println(arr[i1]+" ");
	
	}
}
}
}