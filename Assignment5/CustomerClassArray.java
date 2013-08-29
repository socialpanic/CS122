import java.util.Scanner;
import java.io.*;

class Customer {

	private int C_age; 
	private int C_items;
	private double C_price;
	private double C_total;
	private String C_first_name = "";
	private String C_last_name = "";

    //Default Constructor
	public Customer() 
	{
		C_age = 25; 
		C_items = 10;
		C_price = 10.00;
		C_total = C_items * C_price;
		C_first_name = "John";
		C_last_name = "Doe";
    	}

   	public Customer(String first_name, String last_name, int age, int items, double price, double total) 
   	{
		C_first_name = first_name;
		C_last_name = last_name;
		C_age = age; 
		C_items = items;
		C_price = price;
		C_total = total;
    	}

    	public int get_age() {
        	return C_age;
    	}

    	public int get_items() {
        	return C_items;
    	}

    	public String get_first_name() {
        	return C_first_name;
    	}

    	public String get_last_name() {
        	return C_last_name;
    	}

    	public double get_price(){
		return C_price;
    	}

    	public double get_total(){
		return C_total;
    	}       
}

public class CustomerClassArray 
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
    	{

		int size, age, items;
		double price, total;
		String first_name = "";
		String last_name = "";

		System.out.println("Please enter the length of the array you wish to fill");
		size = console.nextInt();
		Customer[] customer = new Customer[size];
		
		int choice = print_menu();

		if (choice == 1)
		{
		
			for (int i = 0; i < customer.length; i++)
			{
				System.out.println("Customer First Name: ");
				first_name = console.next();
				System.out.println("Customer Last Name: ");
				last_name = console.next();
				System.out.println("Customer Age: ");
				age = console.nextInt();
				System.out.println("Number of Items: ");
				items = console.nextInt();
				System.out.println("Price of Items: ");
				price = console.nextDouble();
				total = price * items;
				customer[i] = new Customer(first_name, last_name, age, items, price, total);
			}	        
		
			for (int i = 0; i < customer.length; i++)
			{
				String FNAME = customer[i].get_first_name();
				String LNAME = customer[i].get_last_name();
				int AGE = customer[i].get_age();
				int ITEMS = customer[i].get_items();
				double PRICE = customer[i].get_price();
				double TOTAL = customer[i].get_total();
				System.out.println("CUSTOMER "+ i);
				System.out.println("The length of the first name: "+ FNAME.length());
				System.out.println("The first letter of the last name: "+ LNAME.substring(0,1));
				System.out.println("The age of the customer: "+ AGE);
				System.out.println("The total number of items bought: "+ ITEMS);
				System.out.println("The customer's total: "+ PRICE);
				System.out.println("The customer's total rounded (cast) from double to int: "+ (int)(TOTAL));
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

			}
		}
		if (choice == 2)
		{
			for (int i = 0; i < customer.length; i++)
			{
				customer[i] = new Customer();
			}
			for (int i = 0; i < customer.length; i++)			//on this loop local varibles are declaired to hold the values we want grabbing them from
			{								//different customer objects on each (i)teration.
				String FNAME = customer[i].get_first_name();
				String LNAME = customer[i].get_last_name();
				int AGE = customer[i].get_age();
				int ITEMS = customer[i].get_items();
				double PRICE = customer[i].get_price();
				double TOTAL = customer[i].get_total();

				System.out.println("CUSTOMER "+ i);
				System.out.println("The length of the first name: "+ FNAME.length());		// length and substring are used to return the values we want.
				System.out.println("The first letter of the last name: "+ LNAME.substring(0,1));
				System.out.println("The age of the customer: "+ AGE);
				System.out.println("The total number of items bought: "+ ITEMS);
				System.out.println("The customer's total: "+ PRICE);
				System.out.println("The customer's total rounded (cast) from double to int: "+ (int)(TOTAL));
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			}
		}
		if (choice == 3)
		{
			System.out.println("The Program will now exit");
		}
	}	
	
	public static int print_menu()
	{
		int menu_choice;
	

		System.out.println("=============================================MENU===================================================");
		System.out.println("1.) Enter Customer");
		System.out.println("2.) Enter John Doe");
		System.out.println("3.) Exit");
	
		menu_choice = console.nextInt();
		
		return menu_choice;
	}
}
