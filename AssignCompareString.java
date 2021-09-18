package week3day1;

public class AssignCompareString {

	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "i am learning java";
		String str3="Java is Simple";
		String str4= "java is simple";
		
		if (str1.equalsIgnoreCase(str2)) { 
			//uppercase is ignored
			System.out.println(" The given Strings : " + str1  + " are same");
		}
		else {
			System.out.println("The given Strings are not same");
		}
		
		if (str3.equals(str4)) {
			//uppercase is not accepted
			System.out.println("The given Strings " + str3 + " are same");
		}
		else
		{
			System.out.println("The given Strings : " + str3 + " are  different");	
	}
	}

}
