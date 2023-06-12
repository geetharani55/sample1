package for_loop;

import java.util.Scanner;

public class For16 
{
	public static void main(String[] kk)
	{
	  int i,n,s,d;
	   System.out.println("ent any one value");
	   Scanner x=new Scanner(System.in);
	   n=x.nextInt();

	   for(s=0; n>0; n=n/10)
	   {
		   d=n%10;
		   s=s+d;
	   }
	   System.out.println("sum of the given value is "+s);
	 
	}
}
