/*******************************************
* NAME:	Mitchell Adams			   *
* PROGRAM: Programming Assignment 2        *
* DATE: March 4, 2013                      *
* CLASS: CS122 WVU-P                       *
* DESCRIPTION: File IO, Control Statements,*
* and Method Calls.			   *
* INSTRUCTER: landon.t.cole@gmail.com      *
*******************************************/

import java.util.Scanner;
import java.io.*;


public class customerfile2
{

	static Scanner console = new Scanner(System.in);	

	public static void main(String[] args)throws FileNotFoundException
	{
		
		int choice;	//This is the ONLY varible used by the main method

	        System.out.println("This is Programming Assignment 1 for CS122 / West Virginia University at Parkersburg");
		System.out.println("This program will take advantages of Java's file in / out methods to take input abilities as well as");
		System.out.println("demonstrates how to call methods from the local class.");
		System.out.println("Press Any Key to Start");
		
		//as usual this prompts the user to start the program

		try 
		{
			System.in.read();
		}
		catch (Exception a){}
		System.out.println("==========================================================================================================");
	
		//This replaces the menu from assignment three as the d0 while loop has been abstracted to the printMenu method. 

		choice = printMenu();

		// if-else control statement to examine user input.

		
		if (choice ==1)
		{
			System.out.println("You have selected textfile.");
			File_In();    //<---------------------------------This calls the File_In method that reads in data from files.
			
		}
		else if (choice ==2)
		{
			System.out.println("You have selected keyboard.");
			Key_In();
		}
		else if (choice ==3)
		{
			System.out.println("You have decided to quit program.");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		

		//After Any called methods are finished executing the program will return to main(), exit the if-else fork, and exit.
		System.out.println("All methods have returned to main and the program will now exit");	
	}

///////////////////////////////////////////////////////////////////File_In()/////////////////////////////////////////////////////////////////////
	//Everything regarding file IO is abstracted to this method

	public static void File_In() throws FileNotFoundException
	{
		File data;
		String name;
		String path;

		int number_of_customers;
			
		System.out.print("What is the path of the file? ");
		path = console.next();
		System.out.print("What is the name of the file? ");
		name = console.next();

		data = new File (path+name);

		if (!data.exists())
		{
			System.out.println("File "+name+" was not located in directry "+path);
		}
		else
		{
		
			Scanner inFile = new Scanner(new FileReader(path+name));
			System.out.print("How many customers do you wish to input? ");
			number_of_customers = console.nextInt();
			
			for (int i = 1; i <= number_of_customers; i++)
			{		
				
				String first_name;
				String last_name;

				double customer_total;
				int customer_age, customer_total_cast, customer_purchas;

				first_name = inFile.next();
				last_name = inFile.next();
				customer_purchas = inFile.nextInt();
				customer_total = inFile.nextDouble();
				customer_total_cast = (int)(customer_total);
				customer_age = inFile.nextInt();

				System.out.println("");				
				System.out.println("The first name is: "+first_name);
				System.out.println("The last name is: "+last_name);
				System.out.println("The total number of items bought: "+customer_purchas);
				System.out.println("The customers total is: "+customer_total);
				System.out.println("The customers total rounded is: "+customer_total_cast);
				System.out.println("The age of the customer is: "+customer_age);
								
				inFile.nextLine();
			}
		}
	}

/////////////////////////////////////////////////////////////Key_In()////////////////////////////////////////////////////////////////////////////


	public static void Key_In()
	{
		String first_name;
		String last_name;
		double price_per_item, customer_total;
		int no_of_entries, customer_age, customer_purchas, customer_total_cast;

		System.out.print("How Many Customer Entries? ");
		no_of_entries = console.nextInt();

		for (int i = 1; i <= no_of_entries; i++)			//same for-loop structure as File_In()
		{
			System.out.print("Customers First Name: ");
			first_name = console.next();
			System.out.print("Customers Last Name: ");
			last_name = console.next();
			System.out.print("Number of Items Bought: ");
			customer_purchas = console.nextInt();
			System.out.print("Please Enter the Price Per Item: ");
			price_per_item = console.nextDouble();
			System.out.print("Customers Age: ");
			customer_age = console.nextInt();
			customer_total = customer_total(customer_purchas, price_per_item); // this calls a method to compute the customers total
			customer_total_cast = (int)(customer_total);
			System.out.println("===============CUSTOMER ENTRY "+i+"======================");
			System.out.println("The length of the first name is: "+first_name.length());
			System.out.println("The first letter of the last name is: "+last_name.substring(0,1));
			System.out.println("The total number of items bought is: "+customer_purchas);
			System.out.println("The customer's total is: "+customer_total);
			System.out.println("The customer's total rounded (cast) is: "+customer_total_cast);
			System.out.println("The age of the customer is: "+customer_age);
		}
	}

	public static int printMenu()
	{
		int choice;
		do 
		{
			System.out.println("How would you like to enter data?");
			System.out.println("(1) To load from a text file.");
			System.out.println("(2) to enter data manually from keyboard.");
			System.out.println("(3) to quit program now.");
			System.out.print("Choice: ");
   			while (!console.hasNextInt()) 
			{
       	    			System.out.println("Please enter either 1 for text file, 2 for keyboard, or 3 to quit.");
       	    			console.next();
       			}
        		choice = console.nextInt();
		} 
		while (choice<=0||choice>3);
		return choice;
	}
	public static double customer_total(double cost, double total)
	{
		double customer_total;
		customer_total = cost * total;
		return customer_total;
	}
}
