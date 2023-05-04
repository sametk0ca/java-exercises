package samet;
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double Area() {
        return length * width;
    }
}
//Samet Koca 210717021