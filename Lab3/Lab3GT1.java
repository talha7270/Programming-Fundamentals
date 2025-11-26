import java.util.Scanner;

	public class Lab3GT1{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		double Amount;	
		System.out.println("Enter the total amount (decimal number)");
		Amount = input.nextDouble();
		int cents =(int) (Amount * 100);

		int  Dollars = cents /100;
		cents = cents % 100;
		
		int  quarter = cents /25;
		cents = cents % 25;

		int   dimes = cents / 10;
		cents = cents % 10;

	        int nickels = cents / 5;
		cents = cents%5;

		int pennies = cents;

		System.out.println("The amount contains :"+ Dollars +" dollars, "+quarter+"  quarters "+dimes+" dimes  "+nickels+" nickels  "+pennies+" pennies.");
		}
}

		
		