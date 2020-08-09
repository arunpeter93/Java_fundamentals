package looping;
import java.util.Scanner;
public class odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int a,b;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the a value");
	a=scan.nextInt();
	System.out.println("enter the b value");
	b=scan.nextInt();
	for(;a<=b;a++)
	{
		if (a%2==0)
		{
			System.out.println("even"+a);
		}
		else
		{
			System.out.println("odd"+a);
		}
	}
	scan.close();
	

	}

}
