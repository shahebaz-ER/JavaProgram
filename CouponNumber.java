import java.util.Random;
import java.util.Scanner;
public  class CouponNumber
 {
   public static void main(String[] args)
    { 
	int i=0,i1,l=1;
	Scanner sc=new Scanner(System.in);
	int max;
	int [] uniqueList;
	System.out.println("Enter the totall no of coupons you want to generated:");
        max=sc.nextInt();
	uniqueList=new int[max+100];
 	int min=1;
        int coup_num;
        for(i1=0;i1<max;i1++)
         {
           int max1=max*100000;
	   coup_num=getRandomNumber( min, max1);
	       if(uniqueList[0]==0)
		  {
	             uniqueList[0]=coup_num;
		     System.out.println(l+"> Generated Unique Coupon no="+coup_num);l++;
		  }
             
		else
		  {  
		    while(!check(coup_num,uniqueList))
			coup_num=getRandomNumber( min, max1);
			{
              		i++;
			uniqueList[i]=coup_num;
		        System.out.println(l+"> Generated Unique Coupon no="+coup_num);l++;
			}
			
		}
          
         }
      }
   public static int getRandomNumber(int min, int max) 
    {
	Random r = new Random();
	return (r.nextInt((max - min) + 1) + min);
    }
   public static   boolean check(int coup_num,int [] uniqueList)
	{
		for(int j=0;j<uniqueList.length;j++)
	         {
		      if(uniqueList[j]==coup_num)
		    	return false;
		 } 	
	              return true;
	}
 }
