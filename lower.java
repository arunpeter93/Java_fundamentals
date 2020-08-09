package string;
import java.util.Scanner;

public class lower {

	/**
	 * to convert lower to upper and vice versa
	 */
	public static void main(String[] args) {
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		s=scan.next();
		char []c=s.toCharArray();
		for (char d:c)
		{
			if(Character.isUpperCase(d))
			{
				 System.out.println("Capital converted: "+Character.toLowerCase(d));
			}
			else if(Character.isLowerCase(d))
			{
				System.out.println("Lower converted: "+Character.toUpperCase(d));
			}
		}
		scan.close();

	}

}
