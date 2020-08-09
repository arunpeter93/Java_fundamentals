package looping;
import java.util.Scanner;

public class numbers {

	
	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		a=scan.nextInt();
		System.out.println("enter the b value");
		b=scan.nextInt();
		for (;a<b;a++)
		{
			System.out.println(a);
		}
		scan.close();
	}

}
