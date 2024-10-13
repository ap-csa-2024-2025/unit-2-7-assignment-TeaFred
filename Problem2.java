import java.util.Scanner;

public class Problem2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Integer x;
    Integer y;

    System.out.println("Enter values:");
    x = scan.nextInt();
    y = scan.nextInt();

    Double avg = ((double)x + y) / 2;
    System.out.println("Average of " + x + " and " + y + " is " + avg);
  }
}
