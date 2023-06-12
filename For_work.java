package for_loop;

import java.util.Scanner;

public class For_work
{
	 public static  void main(String[] kk)
	 {
		 int i,j,f_v,s_v,factor;
		System.out.println("ent any two values");
		Scanner x=new Scanner(System.in);
		f_v=x.nextInt();
		s_v=x.nextInt();
		System.out.println("prime numbers in between "+ f_v+" and "+s_v); 
	   for(i=f_v; i<=s_v; i++)
		  {
			  factor=0;
			  for(j=1; j<=i; j++)
			     {
				     if(i%j==0)
				     {
					 factor=factor+1;
	      		   }
			     }	     
	         if(factor==2)
			      {
			         System.out.println(i);
			      }
		}
	 }

}
