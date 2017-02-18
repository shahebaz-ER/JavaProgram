import java.util.Scanner;
public class Stopwatch {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter 0 to start the stopwatch=");
	int a=sc.nextInt();
	while(!(a==0))
	{
        System.out.print("Please Enter 0 to start the stopwatch=");
	a=sc.nextInt();
	}
        long startTime = System.currentTimeMillis()/ 1000L;
	System.out.println("start Time ="+startTime);
	System.out.print("\n\nPlease Enter 1 to stop the stopwatch=");
	a=sc.nextInt();	
	while(!(a==1))
	{	
 	System.out.print("\n\nPlease Enter 1 to stop the stopwatch=");
	a=sc.nextInt();
	}
        long stopTime = System.currentTimeMillis()/ 1000L;
	System.out.println("stop Time ="+stopTime);
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsed Time in second="+elapsedTime);
  }
}
