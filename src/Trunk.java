public class Trunk implements TrunkInterface {
    boolean isOpen = false;

    @Override
    public void open() {
        isOpen = true ;
        System.out.println("багажник открыт");
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("багажник закрыт");
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }
}