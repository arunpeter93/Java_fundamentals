package string;
import java.util.Scanner;

public class conversion {

	/**
	 * to seperate elements in a string
	 */
	public static void main(String[] args) {
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the s string");
		s=scan.next();
		char[] a=s.toCharArray();
		for(char b:a)
		{
			System.out.println(b);
		}
		
	scan.close();
	}
}


