package conditional;
import java.util.Scanner;
public class age {

	
	public static void main(String[] args) {
		int age;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the age");
		age=scan.nextInt();
		if (age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}
