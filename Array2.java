package arrays;

import java.util.Scanner;

public class Array2
{
	public static void main(String[] kk)
	{
		int i,j;
		int [] a=new int[4];
		
		Scanner x=new Scanner(System.in);
		System.out.println("ent any 4 integer elements");
		for(i=0; i<4; i++)
		{
			a[i]=x.nextInt();
		}
		int [] b=new int[8];
		System.out.println("ent any 8 integer elements");
		for(j=0; j<8; j++)
		{
			b[j]=x.nextInt();
		}
		System.out.println("a array stored elements are");
		for(i=0; i<4; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("b array stored elements are");
		for(j=0; j<8; j++)
		{
			System.out.println(b[j]);
		}

	}
}
