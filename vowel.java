package conditional;
import java.util.Scanner;
public class vowel {


	public static void main(String[] args) {
		char a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character ");
		a=scan.next().charAt(0);
		if (a=='a'||a=='e')
		{
			System.out.println("it has vowels");
		}
scan.close();
	}

}
