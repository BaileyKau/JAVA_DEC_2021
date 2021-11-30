public class Car {
    // member variables
    private String name;
    private String color;
    private int numOfWheels;
    private static int numOfCarsMade = 0;

    // constructor
    public Car() {
        setName("whatever");
        setColor("Blue");
        setNumOfWheels(4);
        this.numOfCarsMade++;
    }
    public Car(String carName) {
        setName(carName);
        setColor("Blue");
        setNumOfWheels(4);
        this.numOfCarsMade++;
    }

    // methods -----------------
    public void honk() {
        System.out.println("Honk!!!!!!");
    }
    public void honk(Car otherCar) {
        System.out.println(this.getName() + " honked at " + otherCar.getName());
    }


    // ---- GETTERS and SETTERS ----
    // static getter
    public static int getCarCount() {
        return numOfCarsMade;
    }
    
    //  Getter
    public String getName() {
        return this.name;
    }
    //  Setter
    public void setName(String carName){
        this.name = carName;
    }
    //  Getter
    public String getColor() {
        return this.color;
    }
    //  Setter
    public void setColor(String carColor){
        this.color = carColor;
    }
    //  Getter
    public int getNumOfWheels() {
        return this.numOfWheels;
    }
    //  Setter
    public void setNumOfWheels(int carNumOfWheels){
        this.numOfWheels = carNumOfWheels;
    }

}