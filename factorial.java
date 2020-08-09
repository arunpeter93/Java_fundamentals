package looping;
import java.util.Scanner;

public class factorial {

	
	public static void main(String[] args) {
	int a,b=1;
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the a value");
	a=scan.nextInt();
	for(;a>0;a--)
	{
		b=a*b;
		
	}
	System.out.println("the factorial is: "+b);
	scan.close();

	}

}
