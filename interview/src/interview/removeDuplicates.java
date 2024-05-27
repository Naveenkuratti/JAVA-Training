package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {
public static void main(String[] args) {
	int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

	
	
	
int rd =removeduplicate(arr);
for(int i=0; i<rd; i++) {
	System.out.print(arr[i]+" ");
}

		
}
public static  int removeduplicate(int arr[]) {
	int rd =0;
	for(int i=1; i<arr.length; i++) {
		if(arr[rd]!=arr[i]) {
			rd++;
			arr[rd]=arr[i];
		}
	}
	return rd+1;
}

}

