package exercises;

public class Loops {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		do {
			System.out.println("The value of x is: " + x);
			x++;
		}while(x < 11);

		while(y < 11)
		{
			System.out.println("The value of y is: " + y);
			y++;
		}
		
		for(int z = 0; z < 11; z++)
		{
			System.out.println("The value of z is: " + z);
		}
		
	}

}
