import java.util.Scanner;
public class Lab3GT4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes since midnight:");
		int minutes = input.nextInt();
		int hours = minutes / 60;
		minutes = minutes % 60;
		
		
		System.out.println("The time is "+hours+":"+minutes);
	}
}