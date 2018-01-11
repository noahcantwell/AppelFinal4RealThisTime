package AppelSemester1;


/**
 * Bouncy Ball Class
 *
 * Noah Cantwell
 * APCSA Period 3
 */
public class BouncyBall
{
    private String color; 
    private double radius;
    private static String brand = "Bounce Co";
    
    //Constructor for bouncy ball made by Bounce Co
    public BouncyBall(String clr, double rad) {
        this.color = clr;
        this.radius = rad;
    }
    
    //Getter for bouncy ball color
    public String getColor() {
        return this.color;
    }
    
    //getter for bouncy ball radius
    public double getRadius() {
        return this.radius;
    }
    
    //getter for brand
    public String getBrand() {
        return brand;
    }
    
    //setter for bouncy ball color
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    
    //setter for bouncy ball radius
    public void changeRadius(double newRad) {
        this.radius = newRad;
    }
    
    //extra method that reduces bouncy ball radius as if it was crushed
    public void compressBall() {
        this.radius *= 0.9;
    }
    
    public String toString() {
        return "The bouncy ball is colored " + this.color + " and has a radius of " + this.radius + " inches. It is made by " + this.brand;
    }
    
    //compares radius of one ball to another
    //returns-1 if value of this is less than value of object, 1 if greater, 0 if equal
    public int compareTo (Object obj) {
        //sets radius of compared object to variable
        double objectRadius = ((BouncyBall)obj).getRadius();
        
        //compares radii to get result
        if (this.radius < objectRadius) {
            return -1;
        }
        else if (this.radius > objectRadius) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
