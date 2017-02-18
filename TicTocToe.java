import java.util.Random;
import java.util.Scanner;
public class TicTocToe
 {
 	public static void main(String [] args)
	{	int i,temp;
		int flag=0,flag1=0,flag3=0;	
	   	char [] matrix=new char[9];	
		 Scanner sc=new Scanner(System.in);				
		 for(i=0;i<9;i++)
			matrix[i]='-';
		
		
		
		
		for(i=0;i<9;i++)
		{
		System.out.print("\n\n-----TIC-TAC-TOE--- GAME-----\n \n Your turn.. please  Enter the posiion no=");
		int element_pos=sc.nextInt()-1;
		if(flag3==0){if(flag==0)
		   {
		    insert(matrix,element_pos);
		    flag=1;
		
		   }flag3=1;}else{
		else
	 	  while(!(isEmpty(matrix,element_pos)))
		   {
			System.out.print("Please Enter unfilled position no=");			
			element_pos=sc.nextInt()-1;
		   }
		if(flag1==1)
		 {
			insert(matrix,element_pos);
			System.out.println("FLAG 1 usER insert fun call hua jab i= "+i);
			flag1=0;
		 }
		else
		 {
			{
		   	while(!(isEmpty(matrix,temp=getRandomNumber(0,8))));
			System.out.println(" random "+temp);
		    	matrix[temp]='X';
			}//computer(matrix);//,element_pos);
			flag1=1;
			System.out.println("uper ka computer fun call hua jab i= "+i);
		 }
		System.out.println("\n \n_________________________________________");
		display(matrix);
		System.out.println("\n \n_________________________________________");
		}}
//if(flag==1)
//System.out.print("string is empty");
	}
	public static  boolean isEmpty(char [] matrix,int element_pos)
	{
		return (matrix[element_pos]=='-');
	  	/*if(matrix[element_pos]=='-')
		return true;
		else
		return false;		*/
	}
	public static void whoWin(char [] matrix,int element_pos)
	{
		
	}
	
	public static void computer(char [] matrix)//,int element_pos)
	{
		int i;
		int temp=0;
		//while(isEmpty(matrix,temp=getRandomNumber(0,8)));
		matrix[temp]='X';
	}
	public static void bestposition()
	{
		
	}
	public static void insert(char [] matrix,int element_pos)
	{       int i;  
		matrix[element_pos]='0';
	}
	public static void display(char [] matrix)
	{
		int i;
		for(i=0;i<9;i++)
		 {System.out.print(" "+matrix[i]+" ");
		   if((i+1)%3==0)
			System.out.println("\n");}
	}
	 
	public static int getRandomNumber(int min, int max) 
        {
	 	 Random r = new Random();
		 return (r.nextInt((max - min) + 1) + min);
        }
 }
