package conditional;
import java.util.Scanner;
public class greater {


	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a valure");
		a=scan.nextInt();
		System.out.println("enter the b value");
		b=scan.nextInt();
		System.out.println("enter the c value");
		c=scan.nextInt();
		if (a>b && a>c)
		{
			System.out.println("a is greater");
			
		}

		else if (b>c && b>a)
		{
			System.out.println("b is greater");
			
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
