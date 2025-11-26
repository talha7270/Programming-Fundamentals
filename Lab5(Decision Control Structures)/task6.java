import java.util.Scanner;
public class task6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numPackages;
        double packagePrice = 99;
        double discountRate = 0;
        double totalPrice, discountAmount, finalPrice;

        System.out.print("Enter number of packages purchased: ");
        numPackages = input.nextInt();

        if (numPackages >= 10 && numPackages <= 19) {
            discountRate = 0.20;
        } else if (numPackages >= 20 && numPackages <= 49) {
            discountRate = 0.30;
        } else if (numPackages >= 50 && numPackages <= 99) {
            discountRate = 0.40;
        } else if (numPackages >= 100) {
            discountRate = 0.50;
        }

        totalPrice = numPackages * packagePrice;
        discountAmount = totalPrice * discountRate;
        finalPrice = totalPrice - discountAmount;

        System.out.println("Discount amount = $" + discountAmount);
        System.out.println("Total after discount = $" + finalPrice);

        input.close();
    }
}