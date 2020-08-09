package array;
import java.util.Scanner;
public class check {

	/**
	 * to check an element whether present or not
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int c=scan.nextInt();
		int []a=new int[c];
		int b;
		for (b=0;b<c;b++)
		{
			a[b]=scan.nextInt();
			
		}
		for (int d: a)
		{
			System.out.println(d);
		}
		scan.close();

	}

}
