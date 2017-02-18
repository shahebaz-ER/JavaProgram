import java.util.Scanner;
public class FlipCoin
	{
		public static void main(String[] args)
			{	int i,head=0,tail=0;
				System.out.println("Enter th number of time you want Flip Coin ");
				Scanner sc=new Scanner(System.in);
				int numflip=sc.nextInt();
				while(numflip<1)
				{
					System.out.print("please enter a positive =");
					numflip=sc.nextInt();
				}
					System.out.println(numflip+" is a positive number");
				for(i=1;i<=numflip;i++)
				{
					if(Math.random()<0.5)
					{
						System.out.println("flip no="+i+"     result is =' tails'");
						tail++;
					}
					else
					{
						System.out.println("flip no="+i+"     result is ='Heads'");
						head++;
					}
				}
 System.out.println("totall num of flips="+numflip+"\n%age of Heads ="+(int)(((double)head/numflip)*100)+"\n%age of tails="+(int)(((double)tail/numflip)*100));
System.out.println("so, The percentage og head vs Tails is "+(int)(((double)head/numflip)*100)+"%");
			}
	}
