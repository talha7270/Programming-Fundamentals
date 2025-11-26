import java.util.Scanner;

public class Task1{
	public static void main (String [] args){
		Scanner key = new Scanner(System.in);
		int userChoice, computerChoice;
		computerChoice = (int)(Math.random() *3);
		
		System.out.println("Enter your choice(0 for Scissor, 1 for Rock, 2 for Paper):");
		userChoice = key.nextInt();

		switch(computerChoice){
		case 0 : System.out.println("Computer chose: Scissor");break;
		case 1 :  System.out.println("Computer chose: Rock");break;
		case 2 :  System.out.println("Computer chose: Paper");break;
		}
		switch(userChoice){
		case 0 : System.out.println("you chose: Scissor");break;
		case1 :  System.out.println("You chose: Rock");break;
		case 2 :  System.out.println("You chose: Paper");break;
		}
		//System.out.println("Computer choose: ");
		//System.out.println("You choose: "+userChoice );

		if(userChoice== computerChoice){
			System.out.println("It's a draw!");
		}

		else if((userChoice == 0 && computerChoice == 2)||(userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)){
		
			System.out.println("You win!!!");}

		else{
			System.out.print("Computer wins.");
		}
		input.close()

	}
}