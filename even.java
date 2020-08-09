package conditional;
import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		int a;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the a value");
		a=scan.nextInt();
		while(a>=1)
		{
		if (a%2==0)
		{
			System.out.println("even no: "+a);
		}
		else
		{
			System.out.println("odd no: "+a);
		}
		a--;
		}

	}

}
