public class Vehicle {
    protected String brand;
    protected int numberOfWheels;
    protected int maxVelocity;
    protected int maxPassengers;
    protected int engineType;

    public Vehicle(String brand, int numberOfWheels, int maxVelocity, int maxPassengers, int engineType) {
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.maxVelocity = maxVelocity;
        this.maxPassengers = maxPassengers;
        this.engineType = engineType;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String getEngineType() {
        switch(engineType){
            case 1: 
                return "Gasoline";
                
            case 2:
                return "Diesel";
                
            case 3:
                return "LPG";
                
            case 4:
                return "Electrical";
                
            case 5:
                return "No engine";

            default:
                return "Invalid type";
        }
    }

    
    public void display() {
      System.out.println("Brand : " + brand + "\nNumber of wheels : " + numberOfWheels + "\nMaximum velocity : " + maxVelocity + "\nMaximum number of passengers : " + maxPassengers + "\nEngine Type : " +getEngineType());
    }
}
//210717021 Samet Koca