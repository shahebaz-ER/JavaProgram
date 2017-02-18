import java.util.Scanner;
public class Factor
 {
  public  static void main(String[] args)
	{	int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value for factor=");
		int value=sc.nextInt();
		for(i=1;i<=value;i++)
		{
			if(isPrime(i))
			{
			if(factPrime(value,i))
			System.out.println("result numbers ="+i);
			}
		}
	}
static	public boolean isPrime(int num)
	{	int flag=0,i;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			flag++;
		}
		if(flag==1)
		return true;
		else
		return false;
	}
static	public boolean  factPrime(int num1,int num2)
	{
		if(num1%num2==0)
		return true;
		else
		return false;
	}
 }
