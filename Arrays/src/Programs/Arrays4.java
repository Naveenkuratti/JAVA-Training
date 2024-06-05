package Programs;

import java.util.Scanner;

public class Arrays4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of arrays:");
		int n = sc.nextInt();
		double ar[]= new double[n];
		System.out.println("enter"+n+"integer valves:");
		double sum=0;
		for(int i=0; i<ar.length;i++) {

			ar[i]=sc.nextDouble();
			sum=ar[i];		
		}
		System.out.println("average is"+sum/n);
	}
}