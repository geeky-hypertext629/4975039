public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double pv, double r, int n) {
        if (n == 0) {
            return pv;
        } else {
            return (1 + r) * futureValueRecursive(pv, r, n - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Present Value (PV)
        double growthRate = 0.05;   // Growth Rate (r)
        int periods = 10;           // Number of Periods (n)

        double futureValue = futureValueRecursive(presentValue, growthRate, periods);
        System.out.println("The future value after " + periods + " periods is: " + futureValue);
    }
}
