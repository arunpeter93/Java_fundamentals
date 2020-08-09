package looping;
import java.util.Scanner;

public class pattern {

	/**
	 * to print patterns
	 */
	public static void main(String[] args) {
		int a,i,j;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the a value");
		a=scan.nextInt();
		for(i=1;i<a;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	}

}
