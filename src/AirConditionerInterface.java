public interface AirConditionerInterface {
    public static final double MIN_TEMPERATURE = 16.0;
    public static final double MAX_TEMPERATURE = 29.0;
    void setTemperature(double temperature) throws IllegalArgumentException;
    double getTemperature();
}
