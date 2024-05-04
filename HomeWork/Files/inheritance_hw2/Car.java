package inheritance_hw2;

public class Car extends Vehicle{
    
public Car(String vehicleID, double speed, double fuelLevel) {
super(vehicleID, speed, fuelLevel);
}

public void accelerate() {
setSpeed(getSpeed() + 3);
setFuelLevel(getFuelLevel() - 1.5);
}

public void refuel(double fuelAmount){
setFuelLevel(getFuelLevel() + fuelAmount);
}

public boolean equals(Car car) {    
return (this.getVehicleID().equals(car.getVehicleID()) && this.getSpeed() == car.getSpeed() && this.getFuelLevel() == car.getFuelLevel());
}

}
