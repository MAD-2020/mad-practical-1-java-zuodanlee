import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter your height: ");
    double height = in.nextDouble();
    System.out.println("Enter your weight: ");
    double weight = in.nextDouble();
    
    System.out.println("Your height: " + height);
    System.out.println("Your weight: " + weight);
  }
}
