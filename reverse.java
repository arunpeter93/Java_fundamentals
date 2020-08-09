package looping;
import java.util.Scanner;

public class reverse {

	/**
	 * to find a reverse of a no
	 */
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no");
		a=scan.nextInt();
		for(b=a,c=0;b>0;b=b/10)
		{
			c=c*10+(b%10);
		}
		System.out.println("the reversed no: "+c);
		scan.close();

	}

}
