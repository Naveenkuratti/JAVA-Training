package interview;

public class RemoveDuplictes {
public static void main(String[] args) {
	int arr[]= {1,2,2,3,4,4};
	
	int rd =removeDuplicates(arr);
	for(int i=0; i<rd; i++) {
		System.out.println(arr[i]+" ");
	}
	 
	
}
public static int  removeDuplicates(int []arr) {
	int rd=0;
	for(int i=1; i<arr.length; i++) {
		if(arr[rd]!=arr[i]);
		rd++;
		arr[rd]=arr[i];
		
		
	}
	return rd+1;
}
 
}
