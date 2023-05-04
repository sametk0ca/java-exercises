package samet;
public class Ellipse extends Shape {
    private double semiMajorAxis; //the largest radius of the ellipse
    private double semiMinorAxis; //the smallest radius of the ellipse
    
    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis; 
        this.semiMinorAxis = semiMinorAxis; 
    }
    
    @Override
    public double Area() {
        return Math.PI * semiMajorAxis * semiMinorAxis; // importing pi number(3.141592...) from math library
    }
}
//Samet Koca 210717021