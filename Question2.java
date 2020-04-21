import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner InputOfUser = new Scanner(System.in);

    System.out.printf("Enter height: ");
    String height = InputOfUser.nextLine(); 
    System.out.printf("Enter weight: ");
    String weight = InputOfUser.nextLine(); 

    System.out.println("Your height is " + height);
    System.out.println("Your weight is " + weight);
  }
}
