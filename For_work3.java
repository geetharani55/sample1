package for_loop;

import java.util.Scanner;

public class For_work3
{
	public static void main(String[] kk)
	{
		int i,n,n1;
		System.out.println("ent any two years");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		n1=x.nextInt();
		System.out.println("leaf years between "+n+"and"+n1);
		for(i=n; i<=n1; i++)
			
		{
			if(i%4==0)
			{
			System.out.println(i);
		}
	}
	}
}
