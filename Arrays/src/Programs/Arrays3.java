package Programs;

import java.util.Scanner;

public class Arrays3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int n = sc.nextInt();
		int ar[] = {1,2,3,4,5,6,7};

		System.out.println("even number in array......");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
		}
		System.out.println("odd number in array......");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2!=0) {
				System.out.println(ar[i]);
			}
		}
	}

}