package exercises;

import java.util.Scanner;

public class RightTriangle {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int answer;
		
		System.out.println("Do you have a right triangle? 1 for yes, any other number for no >> ");
		answer = input.nextInt();
		
		while(answer == 1)
		{
			theorumMethod();
		}

	}
	public static void theorumMethod()
	{
		int sideA;
		int sideB;
		
		System.out.println("\nEnter the measurements for one side of your triangle >> ");
		sideA = input.nextInt();
		
		
		main(null);
	}

}
