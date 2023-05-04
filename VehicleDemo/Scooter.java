public class Scooter extends Vehicle {
    private boolean passengerSeat;

    public Scooter(String brand, int numberOfWheels, int maxVelocity, int maxPassengers, boolean passengerSeat) {
        super(brand, numberOfWheels, maxVelocity, maxPassengers, 5); //constructor of super class which is Vehicle
        this.passengerSeat = passengerSeat;
    }

    public boolean passengerSeat() {
        return passengerSeat;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Has passenger seat? :" + (passengerSeat ? "yes" : "no"));
    }
}
//210717021 Samet Koca