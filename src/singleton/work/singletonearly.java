package singleton.work;

public class singletonearly {
    private static singletonearly instance = new singletonearly();
    private int totalBMICalculated = 0;
    private int numberOfCaculations = 0;

    public double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCaculations++;

        return bmi;
    }

    public double averageBMI() {
        return totalBMICalculated / numberOfCaculations;
    }


    public static singletonearly getinstance() {
        return instance;
    }
}