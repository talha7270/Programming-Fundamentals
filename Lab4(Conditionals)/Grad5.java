import java.util.Scanner;
public class Grad5{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter three integers: ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c = sc.nextInt();

		if(a==b && b==c)
			System.out.println(3);

		if(a==b || a==c)
			System.out.println(2);

		if(a!=b && a!=c)
			System.out.println(0);
	}
}