package conditional;
import java.util.Scanner;

public class profit {

	
	public static void main(String[] args) {
		int sp,cp;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the sp");
		sp=scan.nextInt();
		System.out.println("enter the cp");
		cp=scan.nextInt();
		if (sp>cp)
		{
			System.out.println("profit: "+(sp-cp));
			
		}
		else if(sp<cp)
		{
			System.out.println("loss: "+(cp-sp));
		}
	}

}
