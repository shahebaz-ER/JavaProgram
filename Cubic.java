import java.util.Scanner;
public class Cubic
 {
	public static void main(String[] args)
	 {
		int i,N;
		Scanner sc=new Scanner(System.in);
		System.out.println("how many Element in the array do you want enter=" );
		N=sc.nextInt();
		int [] arr=new int[N];
		System.out.println("Enter the "+N+" Elememts of array=");
		for(i=0;i<N;i++)
		  arr[i]=sc.nextInt();
		  if(!check(arr))
		    System.out.println("Not match found..");
			
                  
	 }
	public static  boolean  check(int [] arr)
	 {
		int i,j,k;
		for(i=0;i<arr.length;i++)
                 {
		   for(j=0;j<arr.length;j++)
		    {
                       if(!(j==i))
                         {
		           for(k=0;k<arr.length;k++)
		            {
                              if(!(k==j ||k==i))
		                 {
                                  if(arr[i]+arr[j]+arr[k]==0)
                                    {  
                                      System.out.println("\n sum of "+arr[i]+"+"+arr[j]+"+"+arr[k]+"=0");
			                  return(true); 
                                    }
                                 }
		             }
		          }
		
		     } 
                 }
                 return(false);
       	}
 }
