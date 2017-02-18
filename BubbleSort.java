import java.io.*;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int i,j,m,temp=0;
		
		System.out.println("Unsorted numbers present in the file :");
                 int [] intArray=new int[120];
		
				
		try
		{
		FileReader reader=new FileReader("/home/bridgeit/Desktop/angular/hello.txt");
		char[] c = new char[300];
			reader.read(c);
			String allName = new String(c);
			reader.close();
			System.out.println(allName);
			String[] nameArray = new String[120];
			nameArray = allName.split(",");

			for(m=0;m<nameArray.length;m++)
				{String strToParse = nameArray[m];
			          strToParse = strToParse.trim();
				  intArray[m]=Integer.parseInt(strToParse);
				}
			
					
			
		}
		catch(Exception e)
		{System.out.println(e);}

		
		
		for(i=0;i<intArray.length;i++)         //sorting the array
		{
			for(j=i+1;j<intArray.length;j++)
			{
				if(intArray[i]>intArray[j])
				{
					temp=intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted order is:");

		for(i=0;i<intArray.length;i++)      
		{
			if(!(intArray[i]==0))
		     System.out.println(intArray[i]);		//printing the sorted array
		}
	}
}
