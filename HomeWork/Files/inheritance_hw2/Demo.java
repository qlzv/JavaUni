package inheritance_hw2;

public class Demo {
public static void main(String[] args) {
Car car1 = new Car("ABC123", 60, 50);
Car car2 = new Car("CSV999", 150, 75);
System.out.println("Car 1 Status : ");
System.out.println("Car 1 ID : " + car1.getVehicleID() + "\nCar 1 Speed : " + car1.getSpeed() + "\nCar 1 Fuel Level : " + car1.getFuelLevel());
System.out.println("-----------------");
System.out.println("Car 2 Status : ");
System.out.println("Car 2 ID : " + car2.getVehicleID() + "\nCar 2 Speed : " + car2.getSpeed() + "\nCar 2 Fuel Level : " + car2.getFuelLevel());
System.out.println("-----------------");
car1.accelerate();
car2.accelerate();
System.out.println("Car 1 Status after Acceleration : ");;
System.out.println("Car 1 ID : " + car1.getVehicleID() + "\nCar 1 Speed : " + car1.getSpeed() + "\nCar 1 Fuel Level : " + car1.getFuelLevel());
System.out.println("-----------------");
System.out.println("Car 2 Status after Acceleration : ");
System.out.println("Car 2 ID : " + car2.getVehicleID() + "\nCar 2 Speed : " + car2.getSpeed() + "\nCar 2 Fuel Level : " + car2.getFuelLevel());
System.out.println("-----------------");
car1.brake();
car2.brake();
System.out.println("Car 1 Status after Brake : ");
System.out.println("Car 1 ID : " + car1.getVehicleID() + "\nCar 1 Speed : " + car1.getSpeed() + "\nCar 1 Fuel Level : " + car1.getFuelLevel());
System.out.println("-----------------");
System.out.println("Car 2 Status after Brake : ");
System.out.println("Car 2 ID : " + car2.getVehicleID() + "\nCar 2 Speed : " + car2.getSpeed() + "\nCar 2 Fuel Level : " + car2.getFuelLevel());
System.out.println("-----------------");
car1.refuel(10);
car2.refuel(20);
System.out.println("Car 1 Status after Refuel : ");
System.out.println("Car 1 ID : " + car1.getVehicleID() + "\nCar 1 Speed : " + car1.getSpeed() + "\nCar 1 Fuel Level : " + car1.getFuelLevel());
System.out.println("-----------------");
System.out.println("Car 2 Status after Refuel : ");
System.out.println("Car 2 ID : " + car2.getVehicleID() + "\nCar 2 Speed : " + car2.getSpeed() + "\nCar 2 Fuel Level : " + car2.getFuelLevel());
System.out.println("-----------------");
if(car1.equals(car2)) {
System.out.println("Exactly the same");
}else{
System.out.println("Different cars");
}
}
}
