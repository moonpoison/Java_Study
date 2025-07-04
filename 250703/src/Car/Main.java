package Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Applicaiton...");

        Car car = new Car();
        car.go();
        car.stop();

        Car car1 = new Car("k5", "black", 1000);
        car1.go();
        car1.stop();

        System.out.println("End Applicaiton...");
    }
}
