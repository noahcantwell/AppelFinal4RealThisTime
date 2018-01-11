package AppelSemester1;


/**
 * Bouncy Ball Driver
 * 
 * Noah Cantwell
 * APCSA Period 3
 */
public class BouncyBallDriver
{
    public static void main() {
        //creates new bouncy balls
        BouncyBall bigGreen = new BouncyBall("Green", 3);
        BouncyBall smallRed = new BouncyBall("Red", 0.5);
        
        //print out static variable
        System.out.println(bigGreen.getBrand());
        
        //toString on both initiated objects
        System.out.println(bigGreen);
        System.out.println(smallRed);
        
        //changeIt method called
        changeIt(bigGreen, smallRed);
        
        //toString called again after changeIt
        System.out.println(bigGreen);
        System.out.println(smallRed);
    }
    
    public static void changeIt(BouncyBall obj1, BouncyBall obj2) {
        //bulk of changeIt changes
        obj1.changeRadius(4);
        BouncyBall obj3 = new BouncyBall("Black", 1);
        obj2 = obj3;
        obj2.changeColor("Blue");
        
        //print after changes
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
