import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    int userNum;

    userNum = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    //Take in a number from the user.
    userNum = scanner.nextInt();

    //Determine if the number is greater than, less than, or equal to 0
    if(userNum>0) {
    System.out.println("The number is positive");
    }

    else if(userNum<0){
      System.out.println("The number is negative");
    }
    else {
      System.out.println("The number is zero");
    }
    scanner.close();
  }
}
