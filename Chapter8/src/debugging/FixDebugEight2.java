package debugging;
// Sum and average an array of integers
public class FixDebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      int tot = 0;
      
      for (int i: someNums)
    	  tot += i;
      
      System.out.println("Sum is " + tot);
      System.out.println("Average is " + tot * 1.0 / someNums.length);
   }
}
