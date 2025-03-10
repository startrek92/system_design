public class BikeVehicleImpl implements Vehicle {

    DriveStrategy driveStrategy;

    public BikeVehicleImpl(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        this.driveStrategy.drive();
    }
}
