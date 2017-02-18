public class TwoDArray
 {
   
   public static < E > void printArray( E[][] inputArray ) 
    {
    	   int i,j;
	   for(i=0;i<=2;i++)
		{
		 for(j=0;j<=2;j++)		
 		   System.out.print(" "+inputArray[i][j]);
		   System.out.println();
		}
    
   }

   public static void main(String args[]) 
   {
      
      Integer[][] intArray = { {1, 2,3},{4, 5,6},{7,8,9}};
      Double[][] doubleArray = { {1.1, 2.2, 3.3},{ 4.4,5.5,6.6},{7.7,8.8,9.9} };
      Character[][] charArray = { {'H', 'E', 'L'},{ 'L', 'O' ,'a'},{'b','c','d'}};

      System.out.println("Array integerArray contains:");
      printArray(intArray);   

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);  
 
      /*System.out.println("Array integerArray contains:");
      printArray(intArray);*/
   }
}
