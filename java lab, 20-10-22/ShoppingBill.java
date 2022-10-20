/*Program:  WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
@author- Dhiraj kumar
@Date- 20.oct.2022 
 */
 
 
 import java.util.Scanner;
 
 
	//create class name
	class ShoppingBill
 {
 
		//calling method
	    static void Bill(int n)
	 {
	     // creating variables
		 int total;
		 total=n*540;
		 
		 if(total>=2000)
			 System.out.println("Discount is 10% and Your Final Bill is "+(total-((10/100)*total)));
			 
		 else
			 System.out.println("Here Total bill is "+(total));
			 
	 }
	 
	 public static void main(String args[])
	 
	 {
		 
	 
	     //creating scanner class object
		 Scanner sc=new Scanner(System.in);
		 int unit;
		 System.out.println("Enter the number of units you purchases from shop:");
		 unit=sc.nextInt();
		 Bill(unit);
		 
		 
	 
	 }
	 // end of main
	 
	 
 }
//end of class