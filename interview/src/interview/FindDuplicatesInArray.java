package interview;

public class FindDuplicatesInArray {
public static void main(String[] args) {
	int nums[]= {1,2,2,3,4,4};
	
	for(int i=0; i<nums.length;i++) {
		
			System.out.print(nums[i]);

		
	}
	System.out.println();
	int rd =removedupicates(nums);
	for(int i=0; i<rd; i++) {
		System.out.print(nums[i]);
		
	}
	
}
public static int  removedupicates(int nums[]) {
	int rd =0;
	for(int i=1; i<nums.length;i++) {
		if(nums[rd]!= nums[i]) {
			
			rd++;
			nums[rd]= nums[i];
		}
		
	}
	return rd+1;
}
}
