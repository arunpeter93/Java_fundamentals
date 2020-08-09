package looping;
import java.util.Scanner;
public class armstrong {

	/**
	 to find armstrong no
	 */
	public static void main(String[] args) {
		int a,b,c,d,e,f,sum,r;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		a=scan.nextInt();
		System.out.println("enter the r value");
		r=scan.nextInt();
		for(;a<=r;a++)
		{
			for(c=0,sum=0,b=a;b>0;b=b/10,c++);
			for(b=a;b>0;b=b/10)
			{
				d=b%10;
				for(e=1,f=1;e<=c;e++)
				{
					f=f*d;
				}
				sum=sum+f;
				if(a==sum)
				{
					System.out.println("arumstrong no: "+sum);
				}
				
			}
		
		}
		
																													
		

	}

}
