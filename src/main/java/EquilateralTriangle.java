/**
 * TODO FOR HOMEWORK - EquilateralTriangle.java
 *      [ ] Update this class to inherit from BaseShape.java
 *      [ ] Update to a valid and logical constructor
 *      [ ] Override the area method
 *      [ ] Override the perimeter method
 *      [ ] Add a static main method
 */
import java.lang.Math.*;

public class EquilateralTriangle extends BaseShape {
    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * NOTE: Remember you only need the length (Same thing as the base) to find the height of an equilateral triangle
     *       height = (sqrt(3)/2) * length
     * Creates an instance of the EquilateralTriangle class
     * @param length The base length of the triangle
     */
    public EquilateralTriangle(double length) {
        super("equilateraltriangle", length, Math.sqrt(3)/2 * length);
    }
//    public EquilateralTriangle(double length,double height) {
//        super("equilateraltriangle", length, Math.sqrt(3)/2 * length);
//    }


    // TODO FOR HOMEWORK: Override the area() method from BaseShape to work for a triangle
    public double area(){
        return (this.getHeight() * this.getLength()) / 2;
    }
    // TODO FOR HOMEWORK: Override the perimeter() method from BaseShape to work for a triangle
    public double perimeter(){
        return (3*this.getLength());
    }
    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args){
        EquilateralTriangle eq = new EquilateralTriangle(10);
        eq.DEBUG_PrintOutAreaAndPerimeter();
    }
}