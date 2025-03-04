"""
Strategy Design Pattern:

Encapsulate Code Logic in classes and use those classes interchangeably across the code
In below example any drive strategy can be passed to any Vehicle class which in turn 
can change the behavior of the classes and also new strategy and new vehicle can be 
added here which will not affect any existing classes in the code.
"""
class DriveStrategy():
    def drive(self):
        pass

class FourWheelerDriveStrategy(DriveStrategy):
    def drive(self):
        print('four wheeler driving here!!')

class TwoWheelerDriveStrategy(DriveStrategy):
    def drive(self):
        print('two wheeler driving here!!')

class SportsTwoWheelerDriveStrategy(DriveStrategy):
    def drive(self):
        print('two wheeler sports drive')

class PushDriveStrategy(DriveStrategy):
    def drive(self):
        print(f'push vehicle strategy')
    

class VehicleBase():
    
    drive_strategy: DriveStrategy = None
    
    def drive(self):
        self.drive_strategy.drive()


class Car(VehicleBase):    
    def __init__(self, drive_strategy: DriveStrategy):
        self.drive_strategy = drive_strategy
        super().__init__()
        

class Bike(VehicleBase):
    def __init__(self, drive_strategy: DriveStrategy):
        self.drive_strategy = drive_strategy
        super().__init__()


class SportsBike(VehicleBase):
    def __init__(self, drive_strategy: DriveStrategy):
        self.drive_strategy = drive_strategy
        super().__init__()


four_wheeler_drive = FourWheelerDriveStrategy()
two_wheeler_drive = TwoWheelerDriveStrategy()
sport_wheeler_drive = SportsTwoWheelerDriveStrategy()
push_wheeler_drive = PushDriveStrategy()

car = Car(push_wheeler_drive)
bike = Bike(sport_wheeler_drive)
sports_bike = SportsBike(sport_wheeler_drive)

car.drive()
bike.drive()
sports_bike.drive()
