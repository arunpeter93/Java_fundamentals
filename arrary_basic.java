package array;
import java.util.Scanner;

public class arrary_basic {

	/**
	 * to print 1D array 
	 */
	public static void main(String[] args) {
		int c;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the c value");
		c=scan.nextInt();
		int [] a=new int[c];
		for (int b=0;b<c;b++)
		{
			
			a[b]=scan.nextInt();
		}
		for(int d:a)
		System.out.print(d+",");
		scan.close();
		

	}

}
