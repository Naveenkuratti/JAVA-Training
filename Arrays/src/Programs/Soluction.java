package Programs;

public class Soluction {
	
		public static void main(String[] args) {
			Employee e1 = new Employee("naveen", 55, 55);
			Employee e2 = new Employee("prajwal", 33, 056667);
				Employee e3 =new Employee("Sai",6589 , 344724);
				Employee [] a= {e1,e2,e3};
				for(int i=0; i<a.length;i++) {
					System.out.println(a[i].name+" "+a[i].id+" "+a[i].salary);
				}
				
		}
	}

