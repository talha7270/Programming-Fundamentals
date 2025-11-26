import java.util.Scanner;

public class  task5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightOfPackage;
        double rateOfShipment;

        // Input
        System.out.print("Enter the weight of package:(in pounds) ");
        weightOfPackage = input.nextDouble();

        // Conditions based on pseudocode
        if (weightOfPackage <= 2) {
            rateOfShipment = 1.10 * weightOfPackage;
            System.out.println("Rate of shipment = $" + rateOfShipment);
        } else if (weightOfPackage > 2 && weightOfPackage <= 6) {
            rateOfShipment = 2.20 * weightOfPackage;
            System.out.println("Rate of shipment = $" + rateOfShipment);
        } else if (weightOfPackage > 6 && weightOfPackage <= 10) {
            rateOfShipment = 3.70 * weightOfPackage;
            System.out.println("Rate of shipment = $" + rateOfShipment);
        } else {
            rateOfShipment = 3.80 * weightOfPackage;
            System.out.println("Rate of shipment = $" + rateOfShipment);
        }

        input.close();
    }
}