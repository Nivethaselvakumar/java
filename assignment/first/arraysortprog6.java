

import java.util.*;


class Sorting{  
 

 public static void main(String args[]){  
  
 int n,temp;
        Scanner s = new Scanner(System.in);
       
        n = s.nextInt();
        int a[] = new int[n];
         
          for(int i = 0; i < n; i++)
          {
            a[i] = s.nextInt();
            
          }
        for(int i = 0; i < n; i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        
           if(a[i]>a[j])
           {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
           }
        	}
        }
        System.out.println("ascending order");
            for(int i = 0; i < n; i++)
            {
        System.out.println(a[i]);   
 
            }
            }  
}  
