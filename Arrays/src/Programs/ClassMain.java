package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ClassMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	
	//syntax
	//datatype[] variable_name= new datatype[size];

//int []arr = new int[5];

//arr[0] =23;
//arr[1] =44;
//arr[2] =45;

//or dictely 
//System.out.println(Arrays.toString(str));


//System.out.println(arr[0]);
//input using for loop
//for(int i=0; i<arr.length; i++) {
//	arr[i]=sc.nextInt();
//}

//for(int i=0; i<arr.length; i++) {
//System.out.println(arr[i]+" ");


String str[] = new String[5];
for(int i=0; i<str.length; i++) {
	str[i]=sc.next();
}
System.out.println(Arrays.toString(str));


}
}
