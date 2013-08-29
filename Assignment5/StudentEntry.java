import java.util.Scanner;
import java.io.*;

class Student {


	//private varibles
	private int C_year; 
	private double C_grades_1;
	private	double C_grades_2;
	private	double C_grades_3;
	private	double C_grades_4;
	private	double C_grades_5;
	private String C_first_name = "";
	private String C_last_name = "";
	private double C_average;

    	//Default Constructor
	public Student() 
	{
		C_grades_1 = 15.0;
		C_grades_2 = 25.0;
		C_grades_3 = 35.0;
		C_grades_4 = 45.0;
		C_grades_5 = 55.0;
		C_year = 1; 
		C_first_name = "John";
		C_last_name = "Doe";
		C_average = (C_grades_1+C_grades_2+C_grades_3+C_grades_4+C_grades_5)/5;
	}
    	

   	public Student(String first_name, String last_name, int year, double grade_1, double grade_2, double grade_3, double grade_4, double grade_5)
   	{
		C_grades_1 = grade_1;
		C_grades_2 = grade_2;
		C_grades_3 = grade_3;
		C_grades_4 = grade_4;
		C_grades_5 = grade_5;
		C_year = year; 
		C_first_name = first_name;
		C_last_name = last_name;
		C_average = (C_grades_1+C_grades_2+C_grades_3+C_grades_4+C_grades_5)/5;		// the average is calculated here.
    	}

    	public int get_year() {
        	return C_year;
    	}

    	public String get_first_name() {
        	return C_first_name;
    	}

    	public String get_last_name() {
        	return C_last_name;
    	}

	public double get_grade_1(){
		return C_grades_1;
    	}
	
	public double get_grade_2(){
		return C_grades_2;
    	}

	public double get_grade_3(){
		return C_grades_3;
    	}
	
	public double get_grade_4(){
		return C_grades_4;
    	}

	public double get_grade_5(){
		return C_grades_5;
    	}
    	public double get_average(){
		return C_average;
    	}       
}

public class StudentEntry 
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
    	{

		int size, year;
		String first_name = "";
		String last_name = "";

		System.out.println("Please enter the length of the array you wish to fill");
		size = console.nextInt();
		Student[] Student = new Student[size];
		
		int choice = print_menu();

		if (choice == 1)
		{
		
			for (int i = 0; i < Student.length; i++)
			{				
				System.out.println("Student First Name: ");
				first_name = console.next();
				System.out.println("Student Last Name: ");
				last_name = console.next();
				System.out.println("Student year: ");
				year = console.nextInt();
				System.out.println("1st Grade ");
				double grade_1 = console.nextDouble();
				System.out.println("2nd Grade ");
				double grade_2 = console.nextDouble();
				System.out.println("3rd Grade ");
				double grade_3 = console.nextDouble();
				System.out.println("4th Grade ");
				double grade_4 = console.nextDouble();
				System.out.println("5th Grade ");
				double grade_5 = console.nextDouble();
				Student[i] = new Student(first_name, last_name, year, grade_1, grade_2, grade_3, grade_4, grade_5);
			}
			choice = print_menu();	   // menu method is called again after students are entered so that the information can either be viewed or appeneded     
		}
		if (choice == 2)
		{
			for (int i = 0; i < Student.length; i++)			
			{								
				String FNAME = Student[i].get_first_name();
				String LNAME = Student[i].get_last_name();
				year = Student[i].get_year();
				double grade_1 = Student[i].get_grade_1();
				double grade_2 = Student[i].get_grade_2();
				double grade_3 = Student[i].get_grade_3();
				double grade_4 = Student[i].get_grade_4();
				double grade_5 = Student[i].get_grade_5();
				double average = Student[i].get_average();

				System.out.println("Student "+ i);
				System.out.println("First Name: "+ FNAME);		
				System.out.println("Last Name: "+ LNAME);
				System.out.println("Year: "+ year);
				System.out.println("Grade 1: "+ grade_1);
				System.out.println("Grade 2: "+ grade_2);
				System.out.println("Grade 3: "+ grade_3);
				System.out.println("Grade 4: "+ grade_4);
				System.out.println("Grade 5: "+ grade_5);
				System.out.println("Average: "+ average);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			}
		}
		choice = print_menu();
		if (choice == 3)
		{
			System.out.println("The Program will now exit");
		}
	}	
	
	public static int print_menu() // Here is the menu method
	{
		int menu_choice;
	

		System.out.println("=============================================MENU===================================================");
		System.out.println("1.) Enter Students");
		System.out.println("2.) Print Students Information");
		System.out.println("3.) Quit The Program");
	
		menu_choice = console.nextInt();
		
		return menu_choice;
	}
}
