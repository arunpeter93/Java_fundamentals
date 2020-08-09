package array;
import java.util.Scanner;

public class matrix {

	/**
	 * to create a matrix and do matrix operation
	 */
	public static void main(String[] args) {
	int c,d,g,h;	
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the no of rows");
    c=scan.nextInt();
    System.out.println("enter the no of column");
    d=scan.nextInt();
    System.out.println("enter the no of rows of matrix 2");
    g=scan.nextInt();
    System.out.println("enter the no of columnof matrix 2");
    h=scan.nextInt();
	int[][]a=new int [c][d];
	int[][]b=new int[g][h];
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<d;j++)
		{
			a[i][j]=scan.nextInt();
		}
	}
	for(int i=0;i<g;i++)
	{
		for(int j=0;j<h;j++)
		{
			b[i][j]=scan.nextInt();
		}
	}
	
	for(int k=0;k<c;k++)
	{
		for(int l=0;l<d;l++)
		{
			System.out.print(a[l][k]+" ");
		
		}
		System.out.println();

	}
	System.out.println("************");
	for(int k=0;k<g;k++)
	{
		for(int l=0;l<h;l++)
		{
			System.out.print(b[l][k]+" ");
		
		}
		System.out.println();

	}
	System.out.println("************");

	for(int k=0;k<c;k++)
	{
		for(int l=0;l<c;l++)
		{
			System.out.print(a[k][l]+" ");//Transpose of the matrix
		}
		System.out.println();
	 }
	
	System.out.println("************");
	for(int k=0;k<c;k++)
	{
		for(int l=0;l<c;l++)
		{
			System.out.print((a[k][l]+b[l][k])+" ");
		}
		System.out.println();
	}
		System.out.println("************");
		for(int k=0;k<g;k++)
		{
			for(int l=0;l<h;l++)
			{
				
				
				System.out.print((a[l][k]*b[l][k]) +" ");
				
			}
			System.out.println();

scan.close();
	}

}
}
