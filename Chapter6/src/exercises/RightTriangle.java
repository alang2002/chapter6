package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;


public class RightTriangle {
	static DecimalFormat df = new DecimalFormat("0.0000"); 
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String answer;
		
		System.out.println("Do you have a right triangle? 'Yes' to continue, 'STOP' or 'Exit' to quit. >> ");
		answer = input.next();
		
		while("Yes".equalsIgnoreCase(answer))
		{
			theorumMethod();
		}
		if("STOP".equalsIgnoreCase(answer) || "Exit".equalsIgnoreCase(answer))
		{
			System.out.println("Over");
		}

	}
	public static void theorumMethod()
	{
		double sideA;
		double sideB;
		double sideC;
		int whichSide;
		
		System.out.println("Which side are you trying to solve for?");
		System.out.println("1 for a, 2 for b, and 3 for c  >> ");
		whichSide = input.nextInt();
		
		if(whichSide == 1) 
			{
			System.out.println("What is side b (unsquared)? >> ");
			sideB = input.nextDouble();
			System.out.println("What is side c? >> ");
			sideC = input.nextDouble();
			sideA = Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideB, 2));
			df.format(sideA);
			System.out.println("The missing side measurement is (a): " + sideA);
			perimeterAndArea(sideA, sideB, sideC);
			}
		if(whichSide == 2)
		{
			System.out.println("What is side a (unsquared)? >> ");
			sideA = input.nextDouble();
			System.out.println("What is side c? >> ");
			sideC = input.nextDouble();
			sideB = Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2));
			df.format(sideB);
			System.out.println("The missing side measurement is (b): " + sideB);
			perimeterAndArea(sideA, sideB, sideC);
		}
		if(whichSide == 3)
		{
			System.out.println("What is side a (unsquared)? >> ");
			sideA = input.nextDouble();
			System.out.println("What is side b? >> ");
			sideB = input.nextDouble();
			sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
			df.format(sideC);
			System.out.println("The missing side measurement is (c): " + sideC);
			perimeterAndArea(sideA, sideB, sideC);
		}
		
		
	}
	public static void perimeterAndArea(double sideA, double sideB, double sideC)
	{
		double perimeter = sideA + sideB + sideC;
		double area = 0.5 * (sideA * sideB);
		df.format(perimeter);
		df.format(area);
		System.out.println("The perimeter is " + perimeter + " and the area is " + area + ".");
		main(null);
	}

}
