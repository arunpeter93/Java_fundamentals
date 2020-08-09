package array;
import java.util.Scanner;

public class sum {

	/**
	 * sum of array elements
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int c=scan.nextInt();
		int []a= new int [c];
		int b;int sum=0;
		for (b=0;b<c;b++)
		{
			a[b]=scan.nextInt();
		}
		for(int d:a)
		{
			sum+=d;
		}
		System.out.println("sum:"+sum);
	}

}
