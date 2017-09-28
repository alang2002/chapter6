package exercises;

public class CountByThrees {

	public static void main(String[] args) {
		int numberLine = 30;
		for(int x = 0; x <= 300; x = x + 3)
		{
			System.out.print(x + " ");
			if(x % numberLine == 0)
			{
				System.out.println();
			}
		}

	}

}
