import java.util.Scanner;
public class Lab4Grad7{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.print("enter length and width of first rectangle ");
		int length1 = input.nextInt();
		int width1 = input.nextInt();
		
	
		System.out.print("enter length and width of second rectangle ");
		int length2= input.nextInt();
		int width2 = input.nextInt();

		int area1 = length1*width1;
		int area2 = length2*width2;

		System.out.println("Area of first rectangle "+area1);
		System.out.println("Area of second rectangle "+area2);

		if (area1 == area2)
			System.out.print("Area of both rectangles is same");

		else if(area1 > area2)

			System.out.print("Area of first rectangle is greater than area of second rectangle");
		else if(area1 < area2)
			System.out.print("Area of second rectangle is greater than area of first rectangle");	
		else
			System.out.print("Invalid Input");
	}
}