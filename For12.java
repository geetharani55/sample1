package for_loop;
import java.util.Scanner;
public class For12 
{
    public static void main(String[] kk)
	 {
		/* int i,n,d;
		 System.out.println("ent any one value");
	      Scanner x=new Scanner(System.in);
	      n=x.nextInt();
	      for(i=1; i<=10; i++)
	      {
	    	  d=n*i;
	    	  System.out.println(n+"*"+i+"="+d);
	      }*/
		 
		 
		 int i,j,n,d;
		 System.out.println("ent any one value");
	      Scanner x=new Scanner(System.in);
	      n=x.nextInt();
	      for(i=1; i<=10; i++)
	      {
	    	  for(j=1; j<=n; j++)
	    	  {
	    		  d=i*j;
		    	  System.out.print(j+"*"+i+"="+d+"\t");
		    	  
	    	  }
	    	  System.out.println(  " ");
	      }
	    
	 
	 }
}
