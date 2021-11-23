import java.awt.*;
import java.util.Scanner;

public class Midpoint {
    public static void main(String[] args) {
        Integer firstX = getIntegerInput("Enter your first X coordinate");
        Integer firstY = getIntegerInput("Enter your first Y coordinate");
        Integer secondX = getIntegerInput("Enter your second X coordinate");
        Integer secondY = getIntegerInput("Enter your second Y coordinate");
        Point firstCoordinate = createPoint(firstX, firstY);
        Point secondCoordinate = createPoint(secondX, secondY);
        Point midpoint = findMidpoint(firstCoordinate, secondCoordinate);
        output(firstCoordinate, secondCoordinate, midpoint);
        System.out.println("Hello");

    }
    public static Integer getIntegerInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.print(prompt + " ==> ");
        String num = input.nextLine();
        Integer finalNum = Integer.decode(num);
        return finalNum;
    }
    public static Point createPoint(Integer a, Integer b){
        Point finalPoint = new Point(a, b);
        return finalPoint;
    }
    public static Point findMidpoint(Point pointA, Point pointB){
        Integer xPointA = new Integer(pointA.x);
        Integer yPointA = new Integer(pointA.y);
        Integer xPointB = new Integer(pointB.x);
        Integer yPointB = new Integer(pointB.y);

        Integer midpointX = (xPointA + xPointB) / 2;
        Integer midpointY = (yPointA + yPointB) / 2;
        return new Point(midpointX, midpointY);
    }
    public static void output(Point pointA, Point pointB, Point midpoint){
        System.out.println("Your first point is " + pointA + "\nYour second point is " + pointB + "\nThis gives you a midpoint of " + midpoint);
    }
}
