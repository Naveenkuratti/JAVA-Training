package interview;

public class Class3 {
	//to find rattion
	public static void main(String[] args) {
		String str1="ABCD";
		String Str2 ="CDAB";
	if(isRotion(str1, Str2)) {
		System.out.println("ration is  present");
	}else {
		System.out.println(" NOT found");
	}

}
	public static boolean isRotion(String str1, String str2) {
		return(str1.length()==str2.length())&&((str1+str1).indexOf(str2))!=-1;
			
		
	}
}
