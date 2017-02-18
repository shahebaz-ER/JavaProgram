import java.util.Scanner;
 class Stock
 {
   public void insertStockDetails()
    { 
	int i;	
	StockPortfolio sp=new StockPortfolio();
	Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of Stock you want to insert=");	
      int nStock=sc.nextInt();	
	String stockArray[]=new String[100];
        int shareArray[]=new int[100];
	int priceArray[]=new int[100];
 	for(i=0;i<nStock;i++)
	{	
		System.out.print("\nEnter the name of Stock no"+(i+1)+" =");
		stockArray[i]=sc.next();
		System.out.print("\nEnter the number of Share you want to insert=");	
		shareArray[i]=sc.nextInt();
		System.out.print("\nEnter the price of  share you want to set=");
		 priceArray[i]=sc.nextInt();	
		
	}
	sp.valueOfEachStock(nStock,stockArray,shareArray,priceArray);
	sp.valueOfTotallStock(nStock,stockArray,shareArray,priceArray);	
    }
   
 }
 class StockPortfolio
{
  public void valueOfEachStock(int nStock,String []stockArray,int []shareArray,int []priceArray)
   { int i;
     System.out.println("Totall no of Stock you have ="+nStock);
     for(i=0;i<nStock;i++)
     {
     System.out.println("Name of Stock["+(i+1)+"]= "+stockArray[i]);
     System.out.println("Number  of share in the  Stock ["+(i+1)+"]"+shareArray[i]);
     System.out.println("Price of one share in Stock ["+(i+1)+"]="+priceArray[i]);
     }
   }
  public void valueOfTotallStock(int nStock,String []stockArray,int []shareArray,int []priceArray)
   {
	int i,j,temp=0;
	for(i=0;i<nStock;i++)
	 {  
           temp=temp+(shareArray[i]*priceArray[i]);
	   
		
                
		
		
	   System.out.println("The value  of totall share of Stock no="+(shareArray[i]*priceArray[i]));
          }
 System.out.println("The value  of totall  Stock is="+temp);
   }
}
public class StockReport
{
  public static void main(String[] args)
    {
      Stock stock1=new Stock();
      StockPortfolio sp=new StockPortfolio();
	stock1.insertStockDetails();

	
    }
}

