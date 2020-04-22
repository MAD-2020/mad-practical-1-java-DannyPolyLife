import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner InputOfUser = new Scanner(System.in);
    
    
    //asking for input
    System.out.printf("Enter height in metres: ");
    double height = InputOfUser.nextDouble(); 
    System.out.printf("Enter weight: ");
    double weight = InputOfUser.nextDouble(); 
    
    //calculating bmi
    double bmi = weight/(height*height);
    System.out.println("Your BMI is " + bmi);
  }
}
