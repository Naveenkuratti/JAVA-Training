package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//syntax
		ArrayList<Integer> list= new ArrayList<Integer>();
		/*list.add(12);
		list.add(45);
		list.add(56);
		System.out.println(list.contains(12865));
	     list.set(0, 45);
	     list.remove(0);
		*///System.out.println(list);
		
		//input
		for(int i=0; i<5; i++) {
			list.add(sc.nextInt());
		}
		//get item at any index
		for(int i=0; i<5; i++) {
			System.out.println(list.get(i));
	}
System.out.println(list);
}
}