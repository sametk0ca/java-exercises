public class Bicycle extends Vehicle {
    private boolean frontBasket;

    public Bicycle(String brand, int numberOfWheels, int maxVelocity, int maxPassengers, boolean frontBasket) {
        super(brand, numberOfWheels, maxVelocity, maxPassengers, 5); //constructor of super class which is Vehicle
        this.frontBasket = frontBasket;
    }

    public boolean hasFrontBasket() {
        return frontBasket;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Has front basket? :" + (frontBasket ? "yes" : "no")); 
    }
}
//210717021 Samet Koca