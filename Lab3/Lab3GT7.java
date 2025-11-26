import java.util.Scanner;

public class Lab3GT7{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		int a,b,c,d;
		System.out.println("Enter the number tickets sold for class A:");
		a = input.nextInt();

		System.out.println("Enter the number tickets sold for class B:");
		b = input.nextInt();

		System.out.println("Enter the number tickets sold for class C:");
		c = input.nextInt();

		System.out.println("Enter the number tickets sold for class D:");
		d = input.nextInt();

		int totalSales = (a*20)+(b*15)+(c*10)+(d*5);

		System.out.println("Total income generated=$"+totalSales);
	}
}
		