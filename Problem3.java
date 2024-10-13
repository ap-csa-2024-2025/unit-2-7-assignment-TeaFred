import java.util.Scanner;
 
public class Problem3
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Integer sides;
    Double length;
    
    System.out.println("Enter number of sides: ");
    sides = scan.nextInt();
    System.out.println("Enter side length: ");
    length = scan.nextDouble();
    
    RegularPolygon p1 = new RegularPolygon(length, sides);
    RegularPolygon p2 = new RegularPolygon();
    p2.setSideLength(length*2);
    p2.setNumSides(sides+2);
    
    System.out.println("The area of a " + p1.toString() + " with side length " + p1.getSideLength() + " is: " + p1.getArea());
    System.out.println("The area of a " + p2.toString() + " with side length " + p2.getSideLength() + " is: " + p2.getArea());
  }
}
