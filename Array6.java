package arrays;

import java.util.Scanner;

public class Array6
{
	public static void main(String[] kk)
	{
	int i,s,b,n;
    int[] a=new int[15];
    System.out.println("ent numner elements to read into a aray");
     Scanner x=new Scanner(System.in);
     n=x.nextInt();
     System.out.println("ent "+n+"elements to read into a arry");
     for(i=0; i<n; i++)
     {
    	 a[i] = x.nextInt();
     }
     b=a[0];
     s=a[0];
     for(i=1; i<n; i++)
     {
    	 if(s>a[i])
    	 {
    		 s=a[i];
    	 }
    	 if(b<a[i])
    	 {
    		 b=a[i];
    	 }
     }
     System.out.println("the biggest element is  "+b+" \n"+"7smallest element is  "+s);
	}
	
	
	
}