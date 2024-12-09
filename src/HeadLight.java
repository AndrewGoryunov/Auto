public class HeadLight implements HeadLightsInterface {
    boolean isOn = false;
    @Override
    public void on() {
        isOn = true;
        System.out.println("фары включены");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("фары выключены");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
