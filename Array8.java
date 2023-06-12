package arrays;

import java.util.Scanner;

public class Array8
{
	 public static void main(String[] kk)
	 {
		 int i,n;
		 int[] a=new int[15];
		 System.out.println("ent number of elelments to read into a array");
		 Scanner x=new Scanner(System.in);
		 n=x.nextInt();
		 System.out.println("ent "+n+ "element to read into a array");
		 for(i=0; i<n; i++)
		 {
			 a[i]=x.nextInt();
		 }
		 System.out.println("even numbers from a array is");
		 {
			 for(i=0; i<n; i++)
			 {
			     if(a[i]%2==0)
			       {
				      System.out.println(a[i]);
			        }
		      }
		 }	 
		 System.out.println("odd numbers from a array id");
			 for(i=0; i<n; i++)
			 {
				if(a[i]%2==1)
				  {
					System.out.println(a[i]);
				    }
	       }
	 }
	 
}
