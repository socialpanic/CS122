/*******************************************
* NAME:	Mitchell Adams                     *
* EMAIL: mitchell.r.adams@gmail.com        *
* PROGRAM: Programming Assignment 1        *
* DATE: Feb 6,2013                         *
* CLASS: CS122 WVU-P                       *
* INSTRUCTER: landon.t.cole@gmail.com      *
* DESCRIPTION: Java crash course with data *
* types and strings                        *
*******************************************/

import java.util.Scanner;

public class java_basics 
{

    	static Scanner console = new Scanner(System.in);

    	public static void main(String[] args){

	String F_name;
	String L_name;
	int qty;
	float price;

        System.out.println("This is Programming Assignment 1 for CS122 / West Virginia University at Parkersburg");
	System.out.println("This program will demonstrate some of the basic methods of the String class as well as casting data types");
	System.out.println("Press Any Key to Start");
	
	/* This try statement right here will prompt the user for input to continue the program. */
	try 
	{
		System.in.read();
	} 
	catch (Exception a){}
	System.out.println("==========================================================================================================");
	
	/* This block gets the first and last name from the user*/
	System.out.println("First Name: ");
	F_name = console.next();
	System.out.println("Last Name: ");
	L_name = console.next();
	
	/* Here I ask for the quantity of items the user wants and define the parameters for expected input*/
	System.out.println("Now many items: ");
	System.out.println("Note: Input must be a positive number in NON-DECIMAL form. (i.e: an INT)");
	
	/* This do-while loop confirms that the user input is an integer */ 
	do 
	{
        	while (!console.hasNextInt()) 
		{
            		System.out.println("INVALID INPUT");
            		console.next();
       		}
        	qty = console.nextInt();

	/*This if else statement makes sure that int is a positive int*/		
		if (qty <= 0)
		{
			System.out.println("INPUT MUST BE > THAN 0");
		}
		else
		{
			break;
		}   	
	} 
	while (qty <= 0);
	
	/*Here I prompt the user for price of items*/
	System.out.println("Price of items: ");
	System.out.println("Note: Input must be a positive number. Decimal input is accepted (i.e: floats and doubles)");
	
	/*prety much the same algorithm for checking the input of qty however this allows for decimal input*/	
	do 
	{
       		while (!console.hasNextFloat()) 
		{
       	    		System.out.println("INVALID INPUT");
       	    		console.next();
       		}
        	price = console.nextFloat();
		
 	/*This checks to make sure the price is a positive value. A negitive could return a negitive balance and fool a cashier*/		
		if (price <= 0)
		{
			System.out.println("INPUT MUST BE > THAN 0");
		}
		else
		{
			break;
		}
   	}
	while (price <= 0);

	/*This block prints out the users input*/
   	System.out.println("Name: "+F_name+" "+L_name);
	System.out.println("QTY: "+qty);
	System.out.println("Price: "+"$"+price);
	System.out.println("TOTAL: "+("$"+qty*price));

	/*This block uses the substring and length methods to count the characters in the names as well as return the first letter */
	System.out.println("The first char in your first name is: "+F_name.substring(0,1));
	System.out.println("The length of your first name is: "+F_name.length());
	System.out.println("The first char in your last name is: "+L_name.substring(0,1));
	System.out.println("The length of your last name is: "+L_name.length());
	System.out.println("==========================================================================================================");
	System.out.println("This concludes assignment 1");
	System.out.println("Press Any Key to Quit:");
	try 
	{
		System.in.read();
	} 
	catch (Exception a){}
	
        }
}
