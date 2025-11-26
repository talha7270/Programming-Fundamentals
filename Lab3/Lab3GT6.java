import java.util.Scanner;

public class Lab3GT6{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		double hoursWorked;
		final double PAYRATE=15.50;
		final double TAXRATE=0.14;
		System.out.println("Enter the number of hours worked for each of the 5 weeks: (separated by a space)");
		int week1= input.nextInt();
		int week2= input.nextInt();
		int week3= input.nextInt();
		int week4= input.nextInt();
		int week5= input.nextInt();
		hoursWorked = week1+week2+week3+week4+week5;

		double GrossIncome = hoursWorked*PAYRATE;
		System.out.println("Gross income before taxes is $"+GrossIncome);
		
		double Tax= GrossIncome * TAXRATE;
		double NetIncome = GrossIncome - Tax;
		System.out.println("Net income after taxes is $"+NetIncome);
		
		double Cloth_accessories = NetIncome * 0.10;
		System.out.println("Money spent on cloths and accesories is:"+Cloth_accessories );
		double schoolSupplies = NetIncome * 0.01;
		System.out.println("Money spent on school supplies is: $"+ schoolSupplies );

		double RemIncome = NetIncome - Cloth_accessories - schoolSupplies;
		double SavingBonds = RemIncome * 0.25;
		System.out.println("Money spent on saving bonds is: $"+ SavingBonds );

		double Additional_bonds = SavingBonds* 0.50;
		System.out.println("Money spent by parents on additional saving bonds is:$"+ Additional_bonds );
		
	}
}
		