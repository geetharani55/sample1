package for_loop;

import java.util.Scanner;

public class For9
{
	public static void main(String[] kk)
	{
		int i,n;
		System.out.println("ent any one value");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		System.out.println("odd numbesr in desending order from "+n);
		for(i=1; n>=i; n=n-2)
		{
			 System.out.println(n);
		}
		
	}

}
