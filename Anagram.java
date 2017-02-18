import java.util.Scanner;
import java.util.Arrays;
public class Anagram
 {
  public static void main(String []args)
    {
	 String string1=new String();
	 String string2=new String();

	 Scanner sc=new Scanner(System.in);

	 System.out.print("Enter the First String=");
	 string1=sc.next();

 	 System.out.print("Enter the Second String=");
	 string2=sc.next();
	
	 char [] c1=string1.toLowerCase().toCharArray();
	 char [] c2=string2.toLowerCase().toCharArray();
	 Arrays.sort(c1);
	 Arrays.sort(c2);

	   if(Arrays.equals(c1,c2))
		System.out.println("Strings are Anagram.");
	   else
		System.out.println("Strings are not Anagram.");
    }
 }
