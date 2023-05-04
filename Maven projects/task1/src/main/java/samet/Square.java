package samet;
public class Square extends Shape {
    private double edge;
    
    public Square(double edge) {
        this.edge = edge;
    }
    
    @Override
    public double Area() {
        return edge*edge;
    }
}
//Samet Koca 210717021