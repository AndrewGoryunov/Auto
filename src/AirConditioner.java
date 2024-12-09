public class AirConditioner implements AirConditionerInterface{
    double currentTemperature;
    @Override
    public void setTemperature(double temperature) throws IllegalArgumentException {
        if (temperature < AirConditioner.MIN_TEMPERATURE || temperature > AirConditioner.MAX_TEMPERATURE) {
            throw new IllegalArgumentException("Температура вне допустимого диапазона. Выберите значение от " + AirConditioner.MIN_TEMPERATURE + " до " + AirConditioner.MAX_TEMPERATURE + " градусов.");
        }
        this.currentTemperature = temperature;
        System.out.println("Температура установлена на " + currentTemperature + " градусов.");

    }

    @Override
    public double getTemperature() {
        return currentTemperature;
    }
}