public class Car extends Vehicle {
    private int bodyType;
    private int numCylinders;

    public Car(String brand, int numberOfWheels, int maxVelocity, int maxPassengers, int engineType,
               int bodyType, int numCylinders) {
        super(brand, numberOfWheels, maxVelocity, maxPassengers, engineType); //constructor of super class which is Vehicle
        this.bodyType = bodyType;
        this.numCylinders = numCylinders;
    }

    public String getBodyType() {
        switch(bodyType){
            case 1:
                return "Sedan";
            case 2:
                return "SUV";
            case 3:
                return "Wagon";
            default:
                return "Invalid type";
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Body Type : " + getBodyType());
    }
}
//210717021 Samet Koca
