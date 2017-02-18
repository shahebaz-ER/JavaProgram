import java.util.Scanner;
public class LeapYear
 {
	public static void main(String[] args)
	{
		System.out.println("Enter the Year=");
		Scanner sc=new Scanner(System.in);
		int  search=sc.nextInt();
		while(search<=1752 || search>=9999)
		{
			System.out.print("please Enter the valid year=");
			search=sc.nextInt();
		}	LeapYear lp=new LeapYear();
			lp.isLeapYear(search);
 }
			public void isLeapYear(int search)
			{
				int value=1752-search;
				if(value%4==0)
				System.out.println(search+" is a Leap Year.");
				else
				System.out.println(search+" is not a Leap Year.");
			}
			
	
 }
