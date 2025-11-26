import java.util.Scanner;
public class Grad9{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number of coins required to make exactly one dollar");
	int coins = input.nextInt();

	System.out.print("Enter no. of pennies: ");
	int pennies = input.nextInt();

	System.out.print("Enter no. of nickels: ");
	int nickels = input.nextInt();

	System.out.print("Enter no. of dimes: ");
	int dimes = input.nextInt();

	System.out.print("Enter no. of quarters: ");
	int quarters = input.nextInt();

	double dollar = (pennies*0.01) + (nickels*0.05) + (dimes*0.1) + (quarters*0.25);
	if (dollar == 1)
	System.out.print("Congratulation! you won the game ... Your total is $"+ dollar);
	else if (dollar > 1)
	System.out.print("You entered greater than one dollar... Your total is $"+ dollar);	
	else if (dollar < 1)
	System.out.print("You entered less than one dollar...  Your total is $"+ dollar);
	}
}