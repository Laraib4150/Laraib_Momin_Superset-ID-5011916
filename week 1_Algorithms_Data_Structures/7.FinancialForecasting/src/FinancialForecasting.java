// FinancialForecasting.java
public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base case: No years left, return the current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: Calculate future value for one year less
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial investment
        double annualGrowthRate = 0.05; // 5% growth rate
        int numberOfYears = 10; // Forecast for 10 years

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, numberOfYears);
        System.out.printf("Future Value after %d years: %.2f%n", numberOfYears, futureValue);
    }
}
