package interview;

public class SearchInsertPostion {
	public static void main(String[] args) {
		 int nums[] = {1,3,5,6};
	        int target = 5;//2
	        System.out.println(searchElemts(nums, target));
	}
	public static  int searchElemts(int []nums, int target) {
		
	int left=0,rigth=nums.length-1;
	while(left<=rigth) {
		int mid =left+(rigth-left)/2;
		if(nums[mid]==target) {
			return  mid;
		}else if(nums[mid]>target) {
			return left+1;
		}else {
			return rigth-1;
		}
		
	}

	return left;

}
}