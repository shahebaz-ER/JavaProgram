import java.util.Scanner;
 class QuestionToAnswer
{
	static int range,count,lower,upper,middle;
	static String input;
	public static void main(String[] args)
    {
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Number:");
			int n=sc.nextInt();
			range=(int)(Math.pow(2,n-1));                
			System.out.println("Take number between '0' to "+range);
			count=0;
			input=null;
			lower=0;
			upper=range;
			middle=(lower+upper/2);
			binarySearch(lower,upper,middle,count,input,n);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}
    }
	public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
   	{
		
		Scanner sc=new Scanner(System.in);
       	        System.out.println("Is your number:"+middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input=sc.next();
       	do
        {
            if (input.equals("high"))
            {
				lower= middle;
				count++;
            }
			else if (input.equals("yes"))
            {
				System.out.println("The number you thought was: "+middle);
				int no=count+1;
				System.out.println("It takes "+no+" times to find your exact number");
				break;
            }
			else if(input.equals("low"))
            {
				upper=middle;
				count++;
			}
            if(count<n)
            {
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				input=sc.next();
			}
		}
		while(lower<=upper);
			if (count>n)
			{
				System.out.println("Number not found");
			}
			else
			{
				System.exit(0);
			}
		}
	
}
