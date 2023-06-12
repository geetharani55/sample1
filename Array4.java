package arrays;

import java.util.Scanner;

public class Array4
{
	 public static void main(String[] kk)
	 {
		 int  i,j,n,n1;
		 int[] a=new int[15];
		 System.out.println("ent number of elements to read into a array");
		 Scanner x=new Scanner(System.in);
		 n=x.nextInt();
		 System.out.println("ent "+n+" elements to read into a array");
		 for(i=0; i<n; i++)
		 {
			 a[i]=x.nextInt();
		 }
		
		 System.out.println("ent number of elements to read into b array");
		 int[] b=new int[20];
		 n1=x.nextInt();
		 System.out.println("ent "+n1+" elements to read into b array");
		 for(j=0; j<n1; j++)
		 {
			 b[j]=x.nextInt();
		 }
		 System.out.println("a array stored elements are");
	     for(i=0; i<n; i++)
	     {
	    	 System.out.println(a[i]);
	     }
	     System.out.println("b array stored elements are");
	     for(j=0; j<n1; j++)
	     {
	    	 System.out.println(b[j]);
	     }
	 }

}
