package samet;
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double Area() {
        return Math.PI * radius * radius; // importing pi number(3.141592...) from math library
    }
}
//Samet Koca 210717021