/*
Program- wap to find cube
@author- Dhiraj kumar
@Date- 20.oct.2022  
*/

//importing packages
 import java.util.Scanner;


  //declaring a class
  public class Cube

 {
	 
   public static void main(String args[])
   
  {
      
	  int n = 5;
      
	  System.out.println("Enter a number ::");
     
	 
	 //creating Scanner object
	 Scanner sc = new Scanner(System.in);
      
	  int num = sc.nextInt();
     

	 // creating variables
	  System.out.println("Cube of the given number is "+(num*num*num));
   }
   // end of main
}
// end of class