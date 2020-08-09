package looping;
import java.util.Scanner;

public class equilateral_pattern {

	/**
	 * to print an equil pattern
	 */
	public static void main(String[] args) {
		int a,i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		a=scan.nextInt();
		for(i=0;i<a;i++)
		{
			System.out.print(" ");
		}
			for(j=0;j<a;j++)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
		
			scan.close();
	}
}
	

