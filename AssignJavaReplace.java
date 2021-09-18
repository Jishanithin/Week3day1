package week3day1;

public class AssignJavaReplace {

	public static void main(String[] args) {
String sentence= "I am working with Java8";

String str= sentence.replaceAll("\\d", "11");
System.out.println(str);
System.out.println(str.substring(5, 14));

System.out.println(str.concat("#"));


	}

}
