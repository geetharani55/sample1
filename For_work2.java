package for_loop;

import java.util.Scanner;

public class For_work2 
{
	public static void main(String[] kk)
	{
		int i,n,a,factor;
		System.out.println("ent any value");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		a=n;
		factor=0;
		for(i=1; i<=n; i++)
		{
			if(n%i==0)
			factor=factor+1;
		}
		if(factor==2)
		{
			System.out.println(n+" is a  prime number");
		}
		n=a*3;
		{
			for(i=1; i<=n; i++)
			{
				 if(n%i==1)
					 factor=factor+1;
			}
		}
		if(factor>2)
		{
			System.out.println(n+" is not a prime number");
		}
	}

}
