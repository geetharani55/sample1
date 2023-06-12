package arrays;

import java.util.Scanner;

public class Array1
{
	 public static void main(String[] kk)
	 {
		//inta[i];
		 int [] a=new int[5];
		 System.out.println("ent any 5 integer elments");
		 Scanner x=new Scanner(System.in);
		 int i;
		 for(i=0; i<5; i++)
		 {
			 a[i]=x.nextInt();
		 }
		 System.out.println("a array stored elemnts are");
		 for(i=0; i<5; i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
	 
}
