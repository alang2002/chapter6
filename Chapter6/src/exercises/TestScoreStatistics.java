package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testScore = 0;
		int[] testArray = new int[51];
		final int QUIT = 999;
		int count = 0;
		int total = 0;
		final int MAX = 100;
		final int MIN = 0;
		
		System.out.println("Enter test score (go above 999 to quit) >> ");
		testScore = input.nextInt();
		
		while(testScore != QUIT){
			testArray[count] = testScore;
			total = total + testArray[count];
			++count;
			if(testScore < MIN || testScore > MAX)
			{
				System.out.println("That score will not work.");
			}
			else {
				System.out.println("Enter next quiz score or " + QUIT + " to quit ");
				testScore = input.nextInt();
			}
		}
		
		System.out.print("The scores entered were: ");
		for(int x = 0; x < count; ++x)
		{
			System.out.println(testArray[x] + " ");
			if(testArray[x] == MAX)
			{
				
			}
		}
		if(count != 0)
		{
			System.out.println("\nThe average is " + (total * 1)/count);
		}
		else
		{
			System.out.println("No scores entered");
		}
		
		

	}

}
