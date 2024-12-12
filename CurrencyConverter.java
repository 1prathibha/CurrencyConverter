import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Exchange rates (example rates; in real-world, you'd fetch live rates via an API)
        double usdToEur = 0.94;   // USD to EUR
        double usdToGbp = 0.82;   // USD to GBP
        double eurToUsd = 1.06;   // EUR to USD
        double gbpToUsd = 1.22;   // GBP to USD

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        // Menu for currency conversion options
        System.out.println("Select the currency you want to convert from:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");

        System.out.print("Enter choice (1, 2, or 3): ");
        int fromCurrency = scanner.nextInt();

        System.out.println("Select the currency you want to convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");

        System.out.print("Enter choice (1, 2, or 3): ");
        int toCurrency = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Perform the conversion based on user input
        double convertedAmount = 0;

        // From USD
        if (fromCurrency == 1) {
            if (toCurrency == 2) {
                convertedAmount = amount * usdToEur;
                System.out.println(amount + " USD = " + convertedAmount + " EUR");
            } else if (toCurrency == 3) {
                convertedAmount = amount * usdToGbp;
                System.out.println(amount + " USD = " + convertedAmount + " GBP");
            } else {
                System.out.println(amount + " USD = " + amount + " USD");
            }
        }

        // From EUR
        else if (fromCurrency == 2) {
            if (toCurrency == 1) {
                convertedAmount = amount * eurToUsd;
                System.out.println(amount + " EUR = " + convertedAmount + " USD");
            } else if (toCurrency == 3) {
                convertedAmount = amount * (usdToGbp / usdToEur); // EUR to GBP conversion via USD
                System.out.println(amount + " EUR = " + convertedAmount + " GBP");
            } else {
                System.out.println(amount + " EUR = " + amount + " EUR");
            }
        }

        // From GBP
        else if (fromCurrency == 3) {
            if (toCurrency == 1) {
                convertedAmount = amount * gbpToUsd;
                System.out.println(amount + " GBP = " + convertedAmount + " USD");
            } else if (toCurrency == 2) {
                convertedAmount = amount * (usdToEur / usdToGbp); // GBP to EUR conversion via USD
                System.out.println(amount + " GBP = " + convertedAmount + " EUR");
            } else {
                System.out.println(amount + " GBP = " + amount + " GBP");
            }
        } else {
            System.out.println("Invalid currency selection!");
        }

        scanner.close();
    }
}