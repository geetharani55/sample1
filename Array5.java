package arrays;

import java.util.Scanner;

public class Array5
{
	public static void main(String[] kk)
	{
		int i,j,n,s;
		int[] a=new int[15];
		System.out.println("ent number of elemnts to read into a rry");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		System.out.println("ent "+n+" ellements to read into a array");
		for(i=0; i<n; i++)
		{
			a[i]=x.nextInt();
		}
		for(i=0; i<n; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[i] < a[j])
				  {
					 s=a[i];
				    a[i]=a[j];
				    a[j]=s;
			     }
	     	}
		}
	System.out.println("a array stored elements in desendig order is ");
	for(i=0; i<n; i++)
	  {
		System.out.println(a[i]);
	  }
  }
}
