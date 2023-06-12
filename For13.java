package for_loop;

import java.util.Scanner;

public class For13 
{
	 public static void main(String[] kk)
	 {
		 int i,n,d;
		 System.out.println("ent any one value");
		 Scanner x=new Scanner(System.in);
		 n=x.nextInt();
		 for(i=10; i>=1; i--)
		 {
			 d=n*i;
			 System.out.println(n+"*"+i+"="+d);
		 }
	 }

}
