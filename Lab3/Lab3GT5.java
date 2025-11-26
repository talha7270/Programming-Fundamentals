import java.util.*;

public class Lab3GT5{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		double totalMilk;
		int milkCartons;

		System.out.println("Enter the total amount of milk produced(in litres)");
		totalMilk = input.nextDouble();

		int Cartons =(int)Math.round (totalMilk / 3.78);
		System.out.println("No. of milk cartons needed:"+Cartons);

		double cost = totalMilk * 0.38;
		System.out.println("Cost of producing milk is : $"+cost);

		double profit = Cartons * 0.27;
		System.out.println("Total profit =$"+profit);
	}
}
		

		
		
		