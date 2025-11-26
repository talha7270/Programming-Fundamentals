import java.util.Scanner;

public class Lab3GT3{
	public static void main(String [] args)
{
		Scanner input = new Scanner(System.in); 
		int a,b,c;
		System.out.println("Enter the number of students in first class");
		a = input.nextInt();
		a++;
		System.out.println("Enter the number of students in second class");
		b = input.nextInt();
		b++;
		System.out.println("Enter the number of students in third class");
		c = input.nextInt();
		c++;

		int total = (a+b+c);
		int ReqTables = total/2;

		System.out.println("Minimum number of tables required is :" + ReqTables);
	}
}