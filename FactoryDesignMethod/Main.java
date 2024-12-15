import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client type (government, semi-public, private): ");
        String clientType = scanner.nextLine();

        System.out.print("Enter the billing amount: ");
        double amount = scanner.nextDouble();

        try {
            Billing billing = BillingFactory.getBilling(clientType);
            double finalAmount = billing.getBilling(amount);

            System.out.println("The final billing amount for a " + clientType + " client is: " + finalAmount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
