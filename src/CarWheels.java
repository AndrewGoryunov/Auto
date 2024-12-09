// Конкретная реализация колеса
class CarWheel implements Wheel {
    public CarWheel() {
    }
    @Override
    public void rotate() {
        System.out.println("Колесо "  + " вращается.");
    }

    @Override
    public String getPosition() {
        return "";
    }
}