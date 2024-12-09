public class Fuel implements FuelTank {
    @Override
    public void fuel() {
    }
    @Override
    public String getFuel() {
        int volume = 100;
        boolean nofuel = volume<25;
        boolean fuel = volume>80;
        if (nofuel) {
            System.out.println("нужна заправка");
            return "needFuel";
        } else if (fuel){
            System.out.println("заправка не нужна");
            return "dont need fuel ";
        } else{
            return "half";
        }
    }
}
