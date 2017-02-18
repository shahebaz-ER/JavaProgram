public class Demo
 {
   public static void main(String []args)
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Your name:");
		String name=sc.nextLine();
		String str="Hello user name,how are you?";
		String str1=str.replace("user name",name);
		System.out.println(str1);
	}
 }
