
/*********************************************************************************************************
*NAME: Mitchell Adams  (mitchell.r.adams@gmail.com)                                                      *
*CLASS: CS122                                                                                            *
*LANGUAGE: JAVA                                                                                          *
*PROGRAM: CustomerList                                                                                   *
*INSTRUCTOR: Landon Cole                                                                                 *
*DESCRIPTION: This is my submission to assignment 4. The program uses a customer constructor and builds  *
*on it via a linked list. The menu in the main function allows the user to add, remove, and print the    *
*contents of the list as well as exit the program.                                                       *
*                                                                                                        *
*                                                                                                        *
*                                                                                                        *
*                                                                                                        *
*                                                                                                        *
*                                                                                                        *
*********************************************************************************************************/
package LinkList;

import java.util.Scanner;


/*********************************************************************************************************
*                                                                                                        *
*  The customer constructor is a modified Link constructor from a Linked list program. It sets up the    *
*  variables that the linked list will use to define customers and their data.                           *
*                                                                                                        *
*                                                                                                        *
*  A point to remember is that constructors do not have return types OR void if they are recognized as   *
*  constructors. To mave javac understand that the constructor and class MUST have the same name.        *
*                                                                                                        *
*  At the link constructor, the parameters passed by main to the LinkedList insert method and are then   *
*  passed and assigned to the Link classes local varibles.                                               *
*                                                                                                        *
*  At printLink(), the information is properly formatted and displayed to the user.                      *
*                                                                                                        *
*  As per the instructions for assignment 4 a second Customer/Link constructor was created to take no    *
*  input and instead assign random John Doe, 0, 0, 0 values for the class attributes.                    *
*********************************************************************************************************/

class Link 
{
    	public String C_first_name;
	public String C_last_name;
	public int C_age;
    	public double C_quantity;
	public double C_cost;
	public double C_total;
    	public Link nextLink;		//Link nextLink references the next node (or customer) in the list

    	//Link constructor
    	public Link(String first_name, String last_name, int age, double quantity, double cost, double total) 
	{
	    	C_first_name = first_name;
	    	C_last_name = last_name;
		C_age = age;
		C_quantity = quantity;
		C_cost = cost;
		C_total = total;
		
    	}

	public Link()
	{
		C_first_name = "John";
	    	C_last_name = "Doe";
		C_age = 55;
		C_quantity = 0;
		C_cost = 0;
		C_total = 0;
	}

    	//Print Link data
    	public void printLink() 
	{
	    	System.out.println("First Name: " + C_first_name);
		System.out.println("Last Name: " + C_last_name);
		System.out.println("Age: " + C_age);
		System.out.println("Quantity: " + C_quantity);
		System.out.println("Cost: $" + C_cost);
		System.out.println("Total: $"+ C_total);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    	}
}

public class LinkList 
{
	public Link first;

  	//LinkList constructor

 	public LinkList() 
	{
	   	first = null;		// The linked list is initially set to null until something is added to it.
    	}

	//Returns true if list is empty

    	public boolean isEmpty() 
	{
	    	return first == null;	// This bool tests to see if the linked list empty
    	}

    	//Inserts a new Link at the first of the list

    	public void insert(String first_name, String last_name, int age, double quantity, double cost, double total) 
	{
	    	Link link = new Link(first_name, last_name, age, quantity, cost, total);
	    	link.nextLink = first;
	    	first = link;
    	}

	public void insert() 
	{
	    	Link link = new Link();
	    	link.nextLink = first;
	    	first = link;
    	}

    	//Deletes the link at the begining of the list

    	public Link delete() 
	{
   		Link temp = first;
 		first = first.nextLink;
  		return temp;
    	}

    	//Prints list data

    	public void printList() 
	{
	    	Link currentLink = first;
		System.out.println("+++++++++++++++++Current List+++++++++++++++++");   // this line and the one below it are purly for esthetics
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	   	while(currentLink != null) 
		{
			currentLink.printLink();
		    	currentLink = currentLink.nextLink;
	    	}
	    	System.out.println("");
    	}
}
