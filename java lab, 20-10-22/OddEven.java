/*
Program: To check number is even or odd
@author- Dhiraj kumar
@Date- 20.oct.2022
*/


  //importing packages
  import java.util.*;
  
  //declaring a class
  class  OddEven
{
		
		
			
	public static void main(String args[])
	{
		
		
		 //creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		// creating variables
		int num= sc.nextInt();
				
		if((num%2)==0)
			System.out.println("The number "+num+" is even");
		else
		   System.out.println("The number "+num+" is odd");
	   
	     
		
		
	}
	// end of main	
	
	
}
// end of class
 

