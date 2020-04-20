import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number (you will be entering this many numbers later):");
    int num = in.nextInt();
    int[] numList = new int[num];

    while (num > 0) {
      numList[--num] = in.nextInt();
    }

    int mode = 0;
    int highestIterationCount = 0;
    for (int i : numList) {
      int iterationCount = 0;
      for (int j : numList) {
        if (i == j) {
          iterationCount++;
        }
      }
      if (iterationCount >= highestIterationCount)  {
        mode = i;
        highestIterationCount = iterationCount;
      }
    }
    System.out.println("Mode: " + mode);
  }
}
