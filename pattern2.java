package looping;
import java.util.Scanner;

public class pattern2 {

	/**
	 * to print inverted right triangle
	 */
	public static void main(String[] args) {
		int a,i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		a=scan.nextInt();
		for(i=a;i>0;i--)
		{
			for(j=i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		scan.close();
		
		
		
		
	}

}
