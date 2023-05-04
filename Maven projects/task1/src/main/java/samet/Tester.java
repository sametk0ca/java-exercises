package samet;
public class Tester {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5]; //creating array for shape objects.

        shapes[0] = new Triangle(8.12, 4.73); 
        shapes[1] = new Square(4.34);
        shapes[2] = new Rectangle(3.2, 4.5);
        shapes[3] = new Circle(2.5);
        shapes[4] = new Ellipse(5.1, 3.1);

        double totalArea = 0.0;

        for (Shape shape : shapes) {
            double area = shape.Area();
            System.out.println("Area of " + shape.getClass().getSimpleName() + " = " + String.format("%.2f",area)); // formatting the number for 2 decimal.
            totalArea += area;
        }
        
        System.out.println("Total area of all shapes = " + String.format("%.2f",totalArea)); // formatting the number for 2 decimal.
    }
}
//Samet Koca 210717021