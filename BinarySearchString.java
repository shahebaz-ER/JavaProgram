import java.util.*;
import java.io.*;
public class BinarySearchString
{      	    
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter totall number of word you want to Enter in array: ");
		int arraySize1=sc.nextInt();
		String b[]=input1DStringArray(arraySize1);
		Arrays.sort(b);									
		System.out.println();

		System.out.println("The Sorted Order is: ");
		print1DStringArray(b);						
		System.out.println();

		System.out.println("Enter Key: ");
		int p=binarySearchString(b,sc.next());

		if(p==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+p+" position");
		}	        
	}
	public static String[] input1DStringArray(int arraySize) 
           {
			Scanner sc=new Scanner(System.in);
		        String array[]=new String[arraySize];
		     
			
			{
			System.out.println("Enter words in array: ");
			
			array=flieDriver(arraySize);
		}
		return array;
             }
         public static void print1DStringArray(String array[])
            {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
            }
       public static int binarySearchString(String[] names, String key) {
    	int first = 0;
    	int last  = names.length;
 
    	while (first < last) {
        	int mid = (first + last) / 2;
        	if (key.compareTo(names[mid]) < 0) {
           			last = mid;
        	} else if (key.compareTo(names[mid]) > 0) {
            		first = mid + 1;
        	} else {
            		return mid;
        	}
    	}		
    	return -1;
}
public static String[] flieDriver(int arraySize)
{
   try{
	int flag=0;       
		FileWriter fr=new FileWriter("/home/bridgeit/Desktop/angular/trash/hello.txt");
		Scanner sc=new Scanner(System.in);
		String str=new String();
		String str1="0";
		
		int temp;
               for(temp=0;temp<arraySize;temp++)
		
	      { str=sc.next();
		if(flag==0)
		{		
		fr.write(str);
		flag=1;}
		else
		fr.write(","+str);
		}
		fr.flush();
		fr.close();
		FileReader reader=new FileReader("/home/bridgeit/Desktop/angular/trash/hello.txt");
		char [] c=new char[500];
		reader.read(c);

		 String allName = new String(c);
		reader.close();
 		  String[] nameArray=new String[arraySize];
	         nameArray= allName.split(",");
		 reader.close();
              return nameArray;
          }
		catch(Exception e){System.out.println(e);}    
            	System.out.println("\nSuccess...");    
		String[] nameArray=new String[arraySize];

		return nameArray;
		
   }

}
