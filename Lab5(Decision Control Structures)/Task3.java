import java.util.Scanner;
public class Task3{
	public static void main (String [] args){
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();

		if(num>0){
			System.out.println("The number is poitive");
				
			if(num%2 == 0){
				System.out.println("It is an even number.");}
			else{
				System.out.println("It is an odd number.");}
		}
		else if (num<0)
				System.out.println("The number is poitive");	
		else 
				System.out.println("The number is zero");
		input.close();
	}
}
		