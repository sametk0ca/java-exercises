public class VehicleDemo{
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[5]; //creating array for objects

        //creating objects (line 5-9)
        vehicles[0] = new Car("Seat", 4, 250, 6, 1, 1, 4);
        vehicles[1] = new Truck("Mercedes", 12, 140, 3, 2, 5000);
        vehicles[2] = new Bicycle("Bisan", 4, 20, 1, true);
        vehicles[3] = new Scooter("Aprilia", 3, 15, 2, false);
        vehicles[4] = new Car("Opel",4,190,4,3,1,3);

        //using for each loop to display vehicles info.
        for(int i = 0 ; i<5; i++){
            System.out.println("\nVEHICLE#" +(i+1));
            vehicles[i].display();
        }
    }
} 
//210717021 Samet Koca