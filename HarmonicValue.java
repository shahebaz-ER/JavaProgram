import java.util.Scanner;
public class HarmonicValue
 {
	public static void main(String[] args)
	{
		int i;
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Nth Harmonic value=");
		int value=sc.nextInt();
		while(value<0)
			{
			System.out.print("Enter a positive value=");
			value=sc.nextInt();	
			}
		System.out.println("value="+value);
		for(i=1;i<=value;i++)
		{
			sum=sum+(1.0/i);
		}
			System.out.println("Value of nth harmonic value"+sum);
	} 
 }
