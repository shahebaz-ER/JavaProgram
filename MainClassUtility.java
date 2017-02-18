import java.util.Arrays;
import java.util.*;


		/**
		 * @author bridgeit Problem Statment..
		 *a. Desc -> Create Utility Class having following methods

			i.  binarySearch method for integer

			ii. binarySearch method for String

			iii.insertionSort method for integer

			iv. insertionSort method for String

			v.  bubbleSort method for integer

			vi. bubbleSort method for String

		b. I/P -> Write main function to call the utility function

		c. Logic -> Check using Stopwatch the Elapsed Time for every method call

		d. O/P -> Output the Search and Sorted List. More importantly print elapsed time
		performance in descending order
		 */
public class MainClassUtility
{   
	public static long start=0;
	public static long end=0;
	public static long elapsed;
	static int ch=0;
	static int [] intArrayStpwtch=new int[100];
	static String [] stringArrayStpwtch=new String[100];
	static int i=0;
	
	public static void main(String[] args)
	{
		
		UtilityClass u=new UtilityClass();
	
		do
		{ 
			System.out.println("--------Menu for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for Integer");
			System.out.println("2. BinarySearch  for String");
			System.out.println("3. InsertionSort  for Integer");
			System.out.println("4. InsertionSort  for String");
			System.out.println("5. BubbleSort for Integer");
			System.out.println("6. BubbleSort for String");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			System.out.println();
	
			switch (choice) 
			{ 
			case 1:
					start=System.currentTimeMillis()/1000L;
					System.out.println("BinarySearch  For Integer");
					System.out.println("Enter size: ");
					int arraySize=sc.nextInt();
					int a[]=u.input1DArray(arraySize);
					Arrays.sort(a);
					u.print1DArray(a);
					System.out.println("Enter Key: ");
					int position=u.binarySearch(a,sc.nextInt());

					if(position==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position+" position");
					}
					end=System.currentTimeMillis()/1000L;
					elapsed=end-start;
					System.out.println("Total Elapsed Time is for this function is: "+elapsed+" sec.");
					intArrayStpwtch[i]=(int)elapsed;
					i++;
					break;
			case 2:
					start=System.currentTimeMillis()/1000L;
					System.out.println("BinarySearch  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize1=sc.nextInt();
					String b[]=u.input1DStringArray(arraySize1);
					Arrays.sort(b);
					u.print1DStringArray(b);
					System.out.println("Enter Key: ");
					int position1=u.binarySearchString(b,sc.next());

					if(position1==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position1+" position");
					}
					end=System.currentTimeMillis()/1000L;
					elapsed=end-start;
					System.out.println("Total Elapsed Time is for this function is: "+elapsed+" sec.");
					intArrayStpwtch[i]=(int)elapsed;
					i++;
					break;
			case 3:
					start=System.currentTimeMillis()/1000L;
					System.out.println("InsertionSort  For Integer");
					u.insertionSortForInteger();
					end=System.currentTimeMillis()/1000L;
					elapsed=end-start;
					System.out.println("Total Elapsed Time is for this function is: "+elapsed+" sec.");
					intArrayStpwtch[i]=(int)elapsed;
					i++;
					break;
			case 4 :
					start=System.currentTimeMillis()/1000L;
					System.out.println("InsertionSort  For String");
					u.insertionSortOfString();
					end=System.currentTimeMillis()/1000L;
					elapsed=end-start;
					System.out.println("Total Elapsed Time is for this function is: "+elapsed+" sec.");
					intArrayStpwtch[i]=(int)elapsed;
					i++;
					break;
			case 5:
					start=System.currentTimeMillis()/1000L;
					System.out.println("BubbleSort  For Integer: ");
					u.bubbleSortForInt();
					end=System.currentTimeMillis()/1000L;
					elapsed=end-start;
					System.out.println("Total Elapsed Time is for this function is: "+elapsed+" sec.");
					intArrayStpwtch[i]=(int)elapsed;
					i++;
					break;
			case 6:
					start=System.currentTimeMillis()/1000L;
					System.out.println("BubbleSort  For String");
					u.bubbleSortforString();
					end=System.currentTimeMillis()/1000L;
					elapsed=end-start;
					System.out.println("Total Elapsed Time is for this function is: "+elapsed+" sec.");
					intArrayStpwtch[i]=(int)elapsed;
					i++;
					break;
			case 7: System.out.println("elapsed time performance in decending order=");
					//int i,j;
					intArrayStpwtch=u.descendingOrder(intArrayStpwtch);
			        for(int i=0;i<intArrayStpwtch.length;i++)
			        {if(!(intArrayStpwtch[i]==0))
			        System.out.println(" "+intArrayStpwtch[i]);}
					System.exit(0);
			default:
					System.out.println("Wrong Input");
					break;
			}
		}

		while(true);
	}
}

class UtilityClass {

	// Take 1D Array Input
	public int[] input1DArray(int arraySize) {
		int array[] = new int[arraySize];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arraySize; i++) {
		System.out.println("Enter array[" + i + "] : ");
		array[i] = sc.nextInt();
		}
		return array;
	}

	// Print 1D array
	public void print1DArray(int array[]) {
		for (int i = 0; i < array.length; i++)
		System.out.print(array[i] + " ");
		System.out.println();
	}

	// Binary Search
	public int binarySearch(int[] inputArr, int key) {
		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	//Take 1D String Array Input
		public String[] input1DStringArray(int arraySize){
			String array[]=new String[arraySize];
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<arraySize;i++){
				System.out.println("Enter array["+i+"] : ");
				array[i]=sc.next();
			}
			return array;
	}
		
		//print 1D array String
		public void print1DStringArray(String array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			System.out.println();
	}
		

		//Binary Search for String
		public int binarySearchString(String[] names, String key) {
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
		
	// Insertion Sort for Integer
	public void insertionSortForInteger() {
		Scanner sc = new Scanner(System.in);
		int i, j, temp, N;

		System.out.print("Enter the totall no of Element you want Insert=");
		N = sc.nextInt();
		int[] array = new int[N];
		System.out.println("Enter the " + N + " Elements=");

		for (i = 0; i < N; i++)
			array[i] = sc.nextInt();
		for (i = 1; i < N; i++) {
			temp = array[i];
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
		System.out.println("Sorted Elements are:");
		for (i = 0; i < N; i++)
			System.out.println(" " + array[i]);
	}
	
    //Insertion Sort for String
	public void insertionSortOfString() {
		Scanner sc = new Scanner(System.in);
		int i, j, N;
		String temp;
		System.out.print("Enter the totall no of Element you want Insert=");
		N = sc.nextInt();
		String[] array = new String[N];
		System.out.println("Enter the " + N + " Elements=");

		for (i = 0; i < N; i++) {
			array[i] = sc.next();
			array[i] = array[i].toUpperCase();
		}

		for (i = 1; i < N; i++) {
			temp = array[i];
			for (j = i - 1; j >= 0 && temp.compareTo(array[j]) < 0; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
		System.out.println("Sorted Elements are:");
		for (i = 0; i < N; i++)
			System.out.println(" " + array[i]);
	}
    //BubbleSort for Integer value
public void bubbleSortForInt() 
{
		int i,j,m,temp=0,N;
		Scanner sc =new Scanner(System.in);	
		System.out.println("Enter the Totall no. of Elements you want to sort=");
		N=sc.nextInt();
              int [] intArray=new int[N];		
		  for(m=0;m<intArray.length;m++)
		   { intArray[m]=sc.nextInt();}
				
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

//BubbleSort for String
public void bubbleSortforString() 
{
	int i,j,m,N;
	String temp=null;
	String temp2="0";
	Scanner sc =new Scanner(System.in);	
	System.out.println("Enter the Totall no. of Elements you want to sort=");	
	N=sc.nextInt();
          String [] stringArray=new String[N];		
	  for(m=0;m<stringArray.length;m++)
	   { stringArray[m]=sc.next();
	     stringArray[m]=stringArray[m].toUpperCase();
	   }
			
	for(i=0;i<stringArray.length;i++)         //sorting the array
	{
		for(j=i+1;j<stringArray.length;j++)
		{
			if(!((stringArray[i].compareTo(stringArray[j]))<0))
			{
				temp=stringArray[i];
				stringArray[i]=stringArray[j];
				stringArray[j]=temp;
			}
		}
	}
	System.out.println();
	System.out.println("The sorted order is:");

	for(i=0;i<stringArray.length;i++)      
	{
		if(!((stringArray[i]).equals(temp2)))
	     System.out.println(stringArray[i]);		//printing the sorted array
	}
}

public int [] descendingOrder(int []intArrayStpwtch)
{
	int i, j, temp;
	for (i = 1; i < intArrayStpwtch.length; i++) {
		temp = intArrayStpwtch[i];
		for (j = i - 1; j >= 0 && temp > intArrayStpwtch[j]; j--) {
			intArrayStpwtch[j + 1] = intArrayStpwtch[j];
		}
		intArrayStpwtch[j + 1] = temp;
	}
	return intArrayStpwtch;
}
}
