import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner InputofUser = new Scanner(System.in);

    System.out.printf("Enter an integer: ");
    int intInput = InputofUser.nextInt();

    System.out.println("Your input Integer multiplied by themself is:  " + (intInput * intInput));
    
  }
}
