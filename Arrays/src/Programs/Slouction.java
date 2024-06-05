package Programs;

public class Slouction {
public static void main(String[] args) {
	Student s1= new Student(22,"Naveen");
	Student s2 = new Student(24, "sai");
	Student s3 = new Student(34,"Divya");
	Student []s= {s1,s2,s3,};
	for(int i=0; i<s.length;i++) {
		System.out.println(s[i].age+" "+s[i].name);
	}
	
	}
}

