import java.util.Scanner;
public class LabTask3{
	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		final int SECRET = 11;
		final double RATE = 12.50;

		int num1, num2 , newNum;
		String name;
		double wages ;
		double hoursWorked;

		System.out.println("Enter two integers separated by a space: ");
		num1= console.nextInt();
		num2 = console.nextInt();

		
		System.out.println("The value of num1 is "+ num1+ " and the value of num2 is " + num2 +"." );
		
		newNum= (num1*2)+num2;
		System.out.println("The value stored in variable newNum is:" + newNum);

		newNum= newNum+SECRET;
		System.out.println("The value of variable newNum added with constant SECRET is: " + newNum);

		System.out.print("Enter your last name: ");
		name = console.next();
		System.out.println("Enter a decimal number between 0 and 70:");
		hoursWorked = console.nextDouble();

		wages = RATE*hoursWorked;
		System.out.println("Name: " + name);
		System.out.println("Pay Rate: $"+RATE);
		System.out.println("Hours Worked:"+hoursWorked);
		System.out.println("Salary: $"+ wages);
	}
}
		
		