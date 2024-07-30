// FinancialForecastingIterative.java
public class FinancialForecastingIterative {

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        double futureValue = currentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial investment
        double annualGrowthRate = 0.05; // 5% growth rate
        int numberOfYears = 10; // Forecast for 10 years

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, numberOfYears);
        System.out.printf("Future Value after %d years: %.2f%n", numberOfYears, futureValue);
    }
}

