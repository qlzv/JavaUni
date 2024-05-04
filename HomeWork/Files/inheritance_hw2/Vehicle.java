package inheritance_hw2;

public class Vehicle {
    
protected String vehicleID;
private double speed;
private double fuelLevel;

public Vehicle(String vehicleID, double speed, double fuelLevel) {
this.vehicleID = vehicleID;
setSpeed(speed);
setFuelLevel(fuelLevel);
}

public void setSpeed(double speed) {
if(speed >= 0 && speed <= 200) {
this.speed = speed;
}else{
this.speed = 0;
}
}

public double getSpeed() {
return speed;
}

public void setFuelLevel(double fuelLevel) {
if(fuelLevel >= 0 && fuelLevel <= 100) {
this.fuelLevel = fuelLevel;
}else{
this.fuelLevel = 0;
}
}

public double getFuelLevel() {
return fuelLevel;
}

public void setVehicleID(String vehicleID) {
this.vehicleID = vehicleID;
}

public String getVehicleID() {
return vehicleID;
}

public void accelerate() {
setSpeed(speed + 10);
setFuelLevel(fuelLevel - 1.5);
}

public void brake(){
setSpeed(speed - 5);
}

}
