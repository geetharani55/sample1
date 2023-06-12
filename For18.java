package for_loop;

import java.util.Scanner;

public class For18 
{
	 public static void main(String[] kk)
	 {
		 int  f1=0, f2=1, f3=f1+f2,n;
		 System.out.println("ent any one value");
		  Scanner x=new Scanner(System.in);
		  n=x.nextInt();
		  
		  System.out.println("fibbonnacci  series upto "+n);
		  System.out.print(f1+" "+f2);
		  for(f1=0; f3<n; f3=f1+f2)
		  {
			  System.out.print(" "+f3+" ");
			   f1=f2;
			   f2=f3;
			   f3=f1+f2;
		  }
		  
	 }

}
