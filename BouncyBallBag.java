package AppelSemester1;


/**
 * BouncyBallBag Class - Bag of multiple bounce balls
 *
 * Noah Cantwell
 * APCSA Period 3
 */
public class BouncyBallBag
{
    //instance variables
    private BouncyBall[] bBalls;
    private double price;
    
    //constructor
    public BouncyBallBag(double cost, int size) {
        this.bBalls = new BouncyBall[size];
        this.price = cost;
    }
    
    //getter for price
    public double getPrice() {
        return this.price;
    }
    
    //getter for ball list
    public BouncyBall[] getBallList() {
        return this.bBalls;
    }
    
    //setter for price
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
    //setter for balls
    public void addBall(BouncyBall b, int spot) {
        bBalls[spot] = b;
    }
    
    //toString for Bouncy ball bag, lists price and all bouncy balls
    public String toString() {
        String output = "The bag of bouncy balls cost $" + this.price + " and contains these balls:";
        for (BouncyBall b: bBalls) {
            output += b.toString() + "\n";
        }
        return output;
    }
    
    //compares amount of balls in one bag to amount in another
    //returns -1 if amount in this bag is less than amount in object bag, 1 if greater, 0 if equal
    public int compareTo (Object ballList) {
        //sets total balls of compared object to variable
        int totalBalls = getBallList().length;
        
        //compares total balls to get result
        if (this.bBalls.length < totalBalls) {
            return -1;
        }
        else if (this.bBalls.length > totalBalls) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
