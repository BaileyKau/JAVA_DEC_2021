public class TestCar{

    // main entry point
    public static void main(String[] args) {

        Car x = new Car("Trusty");
        System.out.println(x.getName());
        System.out.println(x.getNumOfWheels());
        System.out.println(x.getColor());
        x.honk();


        Car z = new Car("Z-car");
        x.honk(z);

        System.out.println(Car.getCarCount());
    }
}