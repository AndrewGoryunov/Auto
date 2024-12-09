public class TurnSignal implements TurnSignalInterface {
    boolean isOn = false;
    String side;

    public TurnSignal(String side) {
        this.side = side;}
    @Override

    public void turnOn() {
        isOn = true;
        System.out.println(side + " поворотник включен");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(side + " поворотник выключен");

    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}