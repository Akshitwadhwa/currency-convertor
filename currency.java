import java.util.Scanner;
public class currency {
    public static double conversionRate;

   // creating a static class so that we can enter the name of the couties we want the money to be converted

    public static void conversionRate(String countryCode) {
        // enter the conversion rate
        switch (countryCode) {
            case "EUR":
                conversionRate = 0.85;
                break;
            case "INR":
                conversionRate = 75.0;
                break;
            case "JPY":
                conversionRate = 110.0;
                break;
            case "GBP":
                conversionRate = 0.75;
                break;
            case "AUD":
                conversionRate = 1.35;
                break;
            default:
                conversionRate = 1.0; // Default to USD if no matching country code
                System.out.println("Unknown country code. Using default rate (USD to USD).");
                break;
        }
    }

    
    public static double convertamount(double amount) {
        return amount * conversionRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD:");
        double amountUSD = sc.nextDouble();

        System.out.println("Enter the country code name  to convert to :");
        String countryCode = sc.next();  
        conversionRate(countryCode);
        double convertedAmount = convertamount(amountUSD);
        System.out.println("Converted amount is: " + convertedAmount + " (" + countryCode.toUpperCase() + ")");

    // closing the scanner class which we named to sc.
    
        sc.close();
    }
}