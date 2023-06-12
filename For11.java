package for_loop;

import java.util.Scanner;

public class For11 
{
	 public static void main(String[] kk)
	 {
		 int i,n,a;
		 System.out.println("ent odd and even numbers to print in desending order");
		 Scanner x=new Scanner(System.in);
		 n=x.nextInt();
		 a=n;
		 if(n%2==1)
		 {
			 System.out.println("odd numbers from "+n);
			 for(i=1; n>=i; n=n-2)
			 {
				 System.out.println(n);
			 }
			 n=a-1;
			 System.out.println("even numbers from "+n);
			 for(i=2; n>=i; n=n-2)
			 {
				 System.out.println(n);
			 }
		 }
		 else
		 {
			 System.out.println("you have choosen wrong choice");
		 }
		 
	 }
}
