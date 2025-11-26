import java.util.*;
public class task4{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter years of Service:");
		int service=input.nextInt();
	
		if(service<3){
			System.out.print("Not eligible for a bonus");
		}
		else{
			System.out.print("Enter the performace rating(1,2,3): ");
			int rating = input.nextInt();
		
				if(rating == 3){
					System.out.println("Bonus =$10,000");
				}
				else if(rating == 2){
					System.out.println("Bonus = $5,000");
				}
				else if(rating == 1)
				{
					System.out.println("Bonus = $2,000");
				}
				else
				{
					System.out.println("Invalid rating! Please enter 1, 2, or 3.");}
		}
		
	}
}