package lesson_01;

import OutOfFuelExeption.OutOfFuelExeption;

public class CarMain {
    public static void main(String[] args) throws OutOfFuelExeption {
        Car car = new Car();
        car.drive(23.3, 56.5);
        System.out.println(car.toString("Traveled to Kiev"));
    }
}
