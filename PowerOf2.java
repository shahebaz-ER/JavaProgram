
public class PowerOf2
 {
public static void main(String[] args)
 	 { int i;
	   String N=args[0];
	   Integer n=Integer.parseInt(N);
	System.out.println(n);
	int n1=10;
	for(i=0;i<=n;i++)
		{
			if(i<0||i==31 )
			break;
	   		System.out.println((int)Math.pow(2,i));
		}
	 }
 }
