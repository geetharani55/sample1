package arrays;

import java.util.Scanner;

public class Array7
{
	public static void main(String[] kk)
	{
		int i,n,s;
		int[]  a=new int[15];
		System.out.println("ent number of elements to read into a array");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		System.out.println("ent "+n+" elements to read into a array");
		for(i=0; i<n; i++)
		{
			a[i] =x.nextInt();
			
		}
		s=0;
		for(i=0; i<n; i++)
		{
			s=s+a[i];
		}
		System.out.println("the sum of the a array ele is "+s);
	}

}
