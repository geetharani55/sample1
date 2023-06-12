package for_loop;

import java.util.Scanner;

public class For10 
{
	public static void main(String[] kk)
	{
		int i,n;
		System.out.println("ent any one value");
		Scanner x=new Scanner(System.in);
          n=x.nextInt();
          System.out.println("even numbers in desending order from "+n);
          for(i=2; n>=i; n=n-2)
          {
        	  System.out.println(n);
          }
		}

}
