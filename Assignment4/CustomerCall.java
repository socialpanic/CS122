import LinkList.*;
import java.util.*;

public class CustomerCall
{
	static Scanner console = new Scanner(System.in);	   	

	public static void main(String[] args) 
	{
		String first_name = ""; 
		String last_name = ""; 
		int age = 0; 
		int quantity = 0; 
		double cost = 0;
		double total = 0;
		
		int menu;
		LinkList list = new LinkList();
		
		do 
		{
			menu = print_menu();

			if (menu == 1)
			{
		
				System.out.print("First Name: ");
				first_name = console.next();
	
				System.out.print("Last Name: ");
				last_name = console.next();
	
				System.out.print("Customer Age: ");
				age = console.nextInt();
	
				System.out.print("Number of Items: ");
				quantity = console.nextInt();

				System.out.print("Item Cost: ");
				cost = console.nextDouble();
				total = quantity * cost;
	
				list.insert(first_name, last_name, age, quantity, cost, total);
			}	
		
			if (menu == 2)
			{
				list.delete();
			}
		
			if (menu == 3)
			{
			    	list.printList();
			}
			if (menu == 4)
			{
				list.insert();
			}
			if (menu == 5)
			{
				System.out.println("The program will now exit");
			}
		}while (menu != 5);		

	}	

	public static int print_menu()
	{
		int menu_choice;
	

		System.out.println("=============================================MENU===================================================");
		System.out.println("1.) Add Customer");
		System.out.println("2.) Remove Customer");
		System.out.println("3.) View Customers");
		System.out.println("4.) Enter a John Doe");      // This automagically calls the Link constructor with no arguments thus generating a defaul "John Doe" entry.
		System.out.println("5.) Quit Program");
	
		menu_choice = console.nextInt();
		
		return menu_choice;
	}	
}
