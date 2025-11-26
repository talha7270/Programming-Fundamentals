import java.util.Scanner;

public class Task2{
	public static void main (String [] args){
		Scanner key = new Scanner(System.in);

		int dayNumber;
		System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
		dayNumber = key.nextInt();

		switch(dayNumber){
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		case 7:System.out.println("Sunday");break;
		default : System.out.println("Invalid input, enter num bw 1-7");break;
		}
		input.close();
	}
}
		