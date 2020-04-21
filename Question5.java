import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner InputOfUser = new Scanner(System.in);
    
    System.out.printf("Enter number of integer you want to enter: ");
    int numberofIntegers = InputOfUser.nextInt();

    System.out.println("You have chosen to enter " + numberofIntegers + " integers");

    ArrayList<Integer> Integers = new ArrayList<>();
    for(int i = 0; i < numberofIntegers; i++){
      System.out.printf("Enter an integer: ");
      int dataInteger = InputOfUser.nextInt();
      Integers.add(dataInteger);
    }
    int highestValue = Integers.get(0);
    for(int i : Integers){
      if (i > highestValue){
        highestValue = i;
      }
    }
    System.out.println("The mode of these integers is: "+ highestValue);
    
  }
}
