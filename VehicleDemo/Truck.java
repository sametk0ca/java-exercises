public class Truck extends Vehicle {
    private int maxTonnage;

    public Truck(String brand, int numberOfWheels, int maxVelocity, int maxPassengers, int engineType,
                 int maxTonnage) {
        super(brand, numberOfWheels, maxVelocity, maxPassengers, engineType); //constructor of super class which is Vehicle
        this.maxTonnage = maxTonnage;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

   @Override
   public void display(){
    super.display();
    System.out.println("Maximum tonnage : " + maxTonnage);
   }
}
//210717021 Samet Koca