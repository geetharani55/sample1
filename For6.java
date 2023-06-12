package for_loop;

import java.util.Scanner;

public class For6
{
	public static void main(String[] kk)
	{
		int i,n;
		System.out.println("ent any one value");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		System.out.println("Natural numbers in desending order upto"+n);
	     for(i=5; i>=n; i--)
	     {
	    	 System.out.println(i);
	     }
	}

}
