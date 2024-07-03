package interview;

public class Class2 {
	public static void main(String[] args) {
	String str="Cloud Tech!@#";
	int count=0;
	 String special="";
	for(int i=0; i<str.length(); i++) {
		
		if(!Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))&& !Character.isLetter(str.charAt(i))) {
			count++;
		}
		
		else {
			special=special+str.charAt(i);
		}
		//if(str.charAt(i)!=' ') {
			
		//}
	}
	
	System.out.println(special);
	if(count==0) {
		System.out.println("is special charcter is not");
	}
	System.out.println("is therr"+count);
	}
	
	
}



