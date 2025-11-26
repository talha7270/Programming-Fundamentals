import java.util.Scanner;

public class FruitDistribution{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int students = input.nextInt();
		
		System.out.println("Enter the number of apples:");
		int apples = input.nextInt();

		int EachStudent = apples / students;
		int remApples= apples % students;

		System.out.println("Each student gets:"+ EachStudent+" apples.");
		System.out.println("There are "+remApples+" apples in the basket.");
	}
}