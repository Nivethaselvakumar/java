

import java.util.*;



class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,result=1;
	
       Scanner sc=new Scanner(System.in);
 
   
	  
       n=sc.nextInt();
 
  
	  
       
 
    if(n==0)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=n;i++)
	 {
            result=result*i;
 	 }	    
     }
    System.out.println("factorial is"+result);
	}
}
