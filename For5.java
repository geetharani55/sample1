package for_loop;

import java.util.Scanner;

public class For5 
{
	 public static void main(String[] kk)
	 {
		 int i,n;
		 System.out.println("ent any one value");
		 Scanner x =new Scanner(System.in);
		 n=x.nextInt();
		 System.out.println("Natural numbers upto "+n);
		 for(i=1; i<=n; i++)
		 {
			 System.out.println(i);
		 }
	 }

}
