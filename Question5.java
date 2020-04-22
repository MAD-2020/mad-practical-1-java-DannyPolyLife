import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner InputOfUser = new Scanner(System.in);
    
    //asking for number of integers
    System.out.printf("Enter number of integer you want to enter: ");
    int numberofIntegers = InputOfUser.nextInt();

    System.out.println("You have chosen to enter " + numberofIntegers + " integers");
    
    //Asking for integers, number of integers depend on the first input
    ArrayList<Integer> Integers = new ArrayList<>();
    for(int i = 0; i < numberofIntegers; i++){
      System.out.printf("Enter an integer: ");
      int dataInteger = InputOfUser.nextInt();
      Integers.add(dataInteger);
    }
    
    //finding the mode
    int highestValue = Integers.get(0);
    for(int i : Integers){
      if (i > highestValue){
        highestValue = i;
      }
    }
    //displaying mode
    System.out.println("The mode of these integers is: "+ highestValue);
    
  }
}
