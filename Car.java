mport java.util.Scanner;
public class Car {
    TurnSignal leftTurnSignal;
    TurnSignal rightTurnSignal;
    Engine engine;
    Wheel frontLeft;
    Wheel frontRight;
    Wheel rearLeft;
    Wheel rearRight;
    Trunk trunk;
    Headlight headlight;
    FuelIndicator fuelIndicator;
    double fuelVolume;
    AirConditioner airConditioner;
    CoolingSystem coolingSystem;

    public Car(double initialFuelVolume, Engine engine) {
        leftTurnSignal = new TurnSignal("левый");
        rightTurnSignal = new TurnSignal("правый");
        frontLeft = new Wheel();
        frontRight = new Wheel();
        rearLeft = new Wheel();
        rearRight = new Wheel();
        trunk = new Trunk();
        headlight = new Headlight();
        fuelIndicator = new FuelIndicator();
        fuelVolume = initialFuelVolume;
        airConditioner = new AirConditioner();
        coolingSystem = new CoolingSystem();
        this.engine = engine;


    }
    public void move() {
        frontLeft.rotate();
        frontRight.rotate();
        rearRight.rotate();
        rearLeft.rotate();
        System.out.println("Машина едет");
    }

    public void fly () {
        frontLeft.flying();
        frontRight.flying();
        rearLeft.flying();
        rearRight.flying();
        System.out.println("Машина летит");
    }

    public void setAirConditionerTemperature(double temperature){
        try {
            airConditioner.setTemperature(temperature);
        } catch (IllegalArgumentException e) {
            System.out.println("недопустимое значение");
        }
    }
    public double getAirConditionerTemperature() {
        return airConditioner.getTemperature();
    }
    public String getFuelStatus() {
        return fuelIndicator.getFuelStatus(fuelVolume);
    }

    public void checkAndCoolEngine() {
        double engineTemperature = engine.getTemperature();
        double optimalTemperature = engine.getOptimalTemperature();
        coolingSystem.startCooling(engineTemperature, optimalTemperature);
    }
    public void StopCooling() {
        coolingSystem.stopCooling();
    }








    public class ParkingLot {
        private List<String> parkedCars = new ArrayList<>();
        public void parkCar(String car) {
            parkedCars.add(car);
            System.out.println(car + " была припаркована.");
        }
        public void rentParkingSpot(String car) {
            if (parkedCars.contains(car)) {
                parkedCars.remove(car);
                System.out.println(car + " была арендована.");
            } else {
                System.out.println("Машина " + car + " не найдена на парковке.");
            }
        }
        public void distributeCarsToZones() {
            List<String> cargoZone = new ArrayList<>();
            List<String> passengerZone = new ArrayList<>();
            List<String> publicTransportZone = new ArrayList<>();
            List<String> motorcycleZone = new ArrayList<>();

            for (String car : parkedCars) {
                // Распределение машин по зонам
                if (car.contains("Грузовик")) {
                    cargoZone.add(car);
                } else if (car.contains("Легковой")) {
                    passengerZone.add(car);
                } else if (car.contains("Общественный транспорт")) {
                    publicTransportZone.add(car);
                } else if (car.contains("Мотоцикл")) {
                    motorcycleZone.add(car);
                }
            }
            System.out.println("Машины распределены по зонам:");
            System.out.println("Грузовые: " + cargoZone);
            System.out.println("Легковые: " + passengerZone);
            System.out.println("Общественный транспорт: " + publicTransportZone);
            System.out.println("Мотоциклы: " + motorcycleZone);
        }

        public static void main(String[] args) {
            ParkingLot parkingLot = new ParkingLot();

            parkingLot.parkCar("Грузовик Volvo");
            parkingLot.parkCar("Легковой BMW");
            parkingLot.parkCar("Общественный транспорт Mercedes");
            parkingLot.parkCar("Мотоцикл Harley-Davidson");

            parkingLot.distributeCarsToZones();

            parkingLot.rentParkingSpot("Грузовик Volvo");
            parkingLot.removeCarForRepair("Мотоцикл Harley-Davidson");

            parkingLot.distributeCarsToZones();
        }
    }
        }

        }
}