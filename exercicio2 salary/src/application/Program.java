package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Employee employee = new Employee();
	
	System.out.println("Enter employee name: ");
	employee.name = sc.nextLine();
	System.out.println("Enter gross salary: ");
	employee.grossSalary = sc.nextDouble();
	System.out.println("Enter tax: ");
	employee.tax = sc.nextDouble();
	
	System.out.println("Employee: " + employee);
	
	System.out.print("Which percentage to increase salary? " );
	employee.percentage = sc.nextDouble();
	
	
	System.out.println("Update data: " + employee);
	
	sc.close();
		
	}

}
