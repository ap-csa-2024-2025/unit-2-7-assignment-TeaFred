[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=16513207)
# unit-2-7-assignment

## API and Documentation
Documentation for the shape classes can be found [here](https://coderunner.projectstem.org/docs/shapes/index.html).

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Run your code by running
```
javac Filename.java
java Filename
```

## Problem 1
Debug the code provided in the starter file so it does the following:

* creates an int with the maximum possible value
* increases this int by 1
* prints the result
* creates an int with the minimum possible value
* decreases this int by 1
* prints the result

## Problem 2
Debug the code provided in the starter file so it does the following:

* creates two `Integer` objects x and y
* sets x and y to inputs entered by the user
* finds the average of the two values and stores this in a `Double` value `avg`
* prints a sentence as shown in the sample run with the values of x, y and the average

Sample run:
```
Enter values:
>5
>12
Average of 5 and 12 is 8.5
```

## Problem 3
Debug the code provided in the starter file so it does the following:

* creates an Integer object named sides
* creates a Double object named length
* gets inputs from the user for each of these objects
* creates a RegularPolygon object p1, with the sides and length value
* creates a second RegularPolygon, p2, with twice the side length of p1, and one more side than p1
* prints the details and areas of p1 and p2 on separate lines

Reference the sample run below to see what a run looks like when the code is running correctly.

Sample run:
```
Enter number of sides:
> 4
Enter side length:
> 2.5
The area of a square with side length 2.5 is: 6.250000000000001
The area of a regular pentagon with side length 5.0 is: 43.01193501472417
```

## Sample Solutions
```java
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Problem 2
		Scanner sc = new Scanner(System.in);
		int numSide;
		double sideLength;
		RegularPolygon rp;

		System.out.println("Enter number of sides:");
		numSide = sc.nextInt();

		System.out.println("Enter the side length:");
		sideLength = sc.nextDouble();

		rp = new RegularPolygon(numSide, sideLength);

		System.out.println("Area with " + rp.getNumSides() + " sides: " + rp.getArea());
		
		rp.addSides(2);
		System.out.println("Incrementing the number of sides by two");
		
		System.out.println("Area with " + rp.getNumSides() + " sides: " + rp.getArea());
	}
}
```
