public class CarVehicleImpl implements Vehicle {

    DriveStrategy driveStrategy;

    @Override
    public void drive() {
        this.driveStrategy.drive();
    }

    public CarVehicleImpl(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
}
