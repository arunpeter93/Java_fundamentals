package looping;
import java.util.Scanner;

public class table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    int a,b=1,c;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the a value");
    a=scan.nextInt();
    for (b=1;b<=10;b++)
    {
    	c=a*b;
    	System.out.println("the table: "+a+"X"+b+"="+c);
    }
    scan.close();

	}

}
