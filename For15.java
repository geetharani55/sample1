package for_loop;

import java.util.Scanner;

public class For15 
{
	public static void main(String[] kk)
	{
		int i,n,s;
		System.out.println("ent any one value");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		s=1;
		for(i=1; i<=n; i++)
		{
			s=s*i;
		}
		System.out.println("factorial of the gievn value is "+s);
	}
}
