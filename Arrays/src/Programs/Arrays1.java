package Programs;

import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of arrays:");
		int n = sc.nextInt();
		int ar[]= new int[n];
		System.out.println("enter"+n+"integer valves:");
		for(int i=0; i<ar.length;i++) {

			ar[i]=sc.nextInt();
		}
		System.out.println("user enterd values in reverse order:");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
	} 

}


