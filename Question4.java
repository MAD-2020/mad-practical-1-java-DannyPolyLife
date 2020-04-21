import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner InputofUser = new Scanner(System.in);
    
    System.out.printf("Enter right angle: ");
    int numberOfAsterick = InputOfUser.nextInt();

    int fixedIntStart = numberOfAsterick;
    for(int i = 0; i < fixedIntStart; i++){
      for(int j = 0; j < numberOfAsterick; j++){
        System.out.printf("*");
      }
      numberOfAsterick -= 1;
      System.out.println();
    } 
    
  }
}
