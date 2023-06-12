package arrays;

import java.util.Scanner;

public class Array3 
{
	public static void main(String[] kk)
	{
		int i,n;
		int[] a=new int[15];
		System.out.println("ent number of elements to read into a array");
		Scanner x=new Scanner(System.in);
		n=x.nextInt();
		System.out.println("ent "+n+"elements to read into a arry");
		for(i=0; i<n; i++)
		{
			a[i]=x.nextInt();
		}
		System.out.println("a array stoerd elements are");
		for(i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}
}