import java.util.Scanner;
public class Grad10{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter no. of Books you bought: ");
	int books = input.nextInt();
	if ( books == 0)
		System.out.print("you earned "+0+" points");
	else if ( books == 1)
		System.out.print("you earned "+5+" points");
	else if ( books == 2)
		System.out.print("you earned "+15+" points");
	else if ( books == 3)
		System.out.print("you earned "+30+" points");
	else 
		System.out.print("you earned "+60+" points");
	}
}