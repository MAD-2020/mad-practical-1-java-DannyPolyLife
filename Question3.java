import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner InputofUser = new Scanner(System.in);
    //asking for input
    System.out.printf("Enter an integer: ");
    int intInput = InputofUser.nextInt();
    //calculation and displaying
    System.out.println("Your input Integer multiplied by themself is:  " + (intInput * intInput));
    
  }
}
