package Programs;

import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of arrays:");
		int n = sc.nextInt();
		int ar[]= new int[n];
		System.out.println("enter"+n+"integer valves:");
		for(int i=0; i<ar.length;i++) {

			ar[i]=sc.nextInt();

		}
		int sum=0;
		for(int i=0; i<ar.length; i++) {

			sum=sum+ar[i];


		}
		System.out.println("sum of arrays"+sum);

	}
}