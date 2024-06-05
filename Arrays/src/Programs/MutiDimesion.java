package Programs;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MutiDimesion {
	public static void main(String[] args) {
		/* 1 2 3
		 * 4 5 6 
		 * 7  8 9
		 */
		Scanner sc = new Scanner(System.in);
	int[][] arr = new int [3] [3];
	//System.out.println(arr.length);
	
	/*int [][] arr2D = {
			{1,2,3},//0th index
			{4,5},//1th index
			{6,7,8,9},//2 nd index -> ar2D={6,7,8,9}
	*/
	
	//input
	//f or(int i=0; i<arr.length; i++) {
	//	arr2D[i] =
		
	//}
		int row;
		for(int col=0; col<arr[row].length; col++) {
	 arr[row][col] = sc.nextInt();
		
		//}

//}
	//output
	for(int row=0; row<arr.length; row++) {
		
		for(int col=0; col<arr[row].length; col++) {
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
	}
	
	
}}
