package string;
import java.util.Scanner;
public class slice {

	/**
	 * to slice a string and find the index of a string
	 */
	public static void main(String[] args) {
		String s,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		s=scan.nextLine();
		System.out.println("enter the words to find index");
		c=scan.nextLine();
		System.out.println(s.indexOf(c));
		System.out.println("the substring: "+s.substring(4));
		System.out.println(s);
		

	}

}
