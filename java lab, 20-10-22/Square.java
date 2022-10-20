/*
Program: wap to find square
@author- Dhiraj kumar
@Date- 20.oct.2022
*/

//importing packages
import java.util.Scanner;

  //declaring a class
  public class Square


  {
	  
	private static Scanner sc;
	
	public static void main(String [] args) 
	
	{
		int number, square;
		sc = new Scanner(System.in);
		
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();		
		
		
		square = number * number;
		
		
		System.out.println("\n The Square of a Given Number  " + number + "  =  " + square);
	}
	
	// end of main
}
// end of class