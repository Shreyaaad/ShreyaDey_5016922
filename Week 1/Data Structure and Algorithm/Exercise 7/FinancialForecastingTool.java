package Exercise_7;

public class FinancialForecastingTool {
    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        
        if (periods == 0) {
            return initialValue;
        }
       
        return calculateFutureValue(initialValue, growthRate, periods - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; 
        double growthRate = 0.05; 
        int periods = 10;

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);
        System.out.println("The future value after " + periods + " periods is: " + futureValue);
    }
}
