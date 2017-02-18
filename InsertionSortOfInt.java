import java.util.Scanner;
public class InsertionSortOfInt
{
  public static void main(String[] args)
   {	
	Scanner sc=new Scanner(System.in);
    	int i,j,temp,N;
	
 	System.out.print("Enter the totall no of Element you want Insert=");
	N=sc.nextInt();
    	int []array=new int[N];
	System.out.println("Enter the "+N+" Elements=");
	
	for(i=0;i<N;i++)
         array[i]=sc.nextInt();
	for(i=1;i<N;i++)
	 {
   	   temp=array[i];		
	   for(j=i-1;j>=0 &&temp<array[j];j--)
		{	
		 array[j+1]=array[j];
		}array[j+1]=temp;
	 }
	System.out.println("Sorted Elements are:");
	for(i=0;i<N;i++)
	System.out.println(" "+array[i]);
   }
}
