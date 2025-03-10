public class Main {

    public static void main(String[] args) {

        CarDriveStrategyImpl carDriveStrategy = new CarDriveStrategyImpl();
        CarVehicleImpl carVehicle = new CarVehicleImpl(carDriveStrategy);

        BikeDriveStrategyImpl bikeDriveStrategy = new BikeDriveStrategyImpl();
        BikeVehicleImpl bikeVehicle = new BikeVehicleImpl(bikeDriveStrategy);

        carVehicle.drive();
        bikeVehicle.drive();
    }
}
