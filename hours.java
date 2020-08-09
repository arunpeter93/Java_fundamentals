package fundamental;
import java.util.Scanner;

public class hours {

	public static void main(String[] args) {
		int h,m;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the hour value");
		h=scan.nextInt();
		System.out.println("enter the minute");
		m=scan.nextInt();
		System.out.println("hours in minutes: "+((h*60)+m));
	}

}
