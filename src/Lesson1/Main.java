package Lesson1;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Red", 2000, 1980, 60);
        Car car = new Car("Blue", 1000, 2018, 300 );

        car.beep();
        System.out.println();

        car.acceleration(34);
        car.deceleration(45);
        System.out.println(car);
        
        car1.acceleration(123);
        car1.deceleration(67);
        System.out.println(car1);
    }
}
