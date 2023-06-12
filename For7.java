package for_loop;

import java.util.Scanner;

public class For7
{
	public static void main(String[] kk)
	{
        int i,n;
        System.out.println("ent any one value");
	    Scanner x=new Scanner(System.in);
	    n=x.nextInt();
	    System.out.println("odd numbers upto  "+n);
	    for(i=1; i<=n; i=i+2)
	    {
	    	System.out.println(i);
	    }
	}

}
