package for_loop;

import java.util.Scanner;

public class For_work4 
{
	 public static void main(String[] kk)
	 {
		 int i,n,n1,s;
		 System.out.println("ent odd numbers");
	    Scanner x=new Scanner(System.in);
	    n=x.nextInt();
	    n1=x.nextInt();
	 s=0;
	 for(i=1; i<=n1; i=i+2)
	 {
		 s=s+i;
	 }
		 System.out.println("sum of odd numbers between "+n+"and"+i+"is"+s);
	 
	 }

}
