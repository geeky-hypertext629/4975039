import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingOptimized {

    // Recursive method to calculate future value with memoization
    public static double futureValueRecursiveOptimized(double pv, double r, int n, Map<Integer, Double> memo) {
        if (n == 0) {
            return pv;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        double result = (1 + r) * futureValueRecursiveOptimized(pv, r, n - 1, memo);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Present Value (PV)
        double growthRate = 0.05;   // Growth Rate (r)
        int periods = 10;           // Number of Periods (n)

        Map<Integer, Double> memo = new HashMap<>();
        double futureValue = futureValueRecursiveOptimized(presentValue, growthRate, periods, memo);
        System.out.println("The future value after " + periods + " periods is: " + futureValue);
    }
}
