public class SimpleInterestCalculator {

    // Method to calculate simple interest
    // Takes principal, rate, and time as arguments
    // Returns the calculated simple interest as a double
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Simple Interest formula: (Principal * Rate * Time) / 100
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Example usage:
        double principalAmount = 10000.0; // Principal amount
        double interestRate = 5.0;      // Annual interest rate (as a percentage)
        double timePeriod = 3.0;        // Time period in years

        // Call the calculateSimpleInterest method and store the returned value
        double calculatedInterest = calculateSimpleInterest(principalAmount, interestRate, timePeriod);

        // Print the result
        System.out.println("Principal Amount: $" + principalAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Time Period: " + timePeriod + " years");
        System.out.println("Simple Interest: $" + calculatedInterest);
    }
}