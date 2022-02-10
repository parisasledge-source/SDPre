import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    int num;

    num = 6;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    //Take in a number from the user.
    num = scanner.nextInt();

    //Determine if the number is even or odd

    if(num % 2 == 0){
    System.out.println("The number is even");
    } //would determine if a number is even

    else if(num % 2 == 1){
      System.out.println("The number is odd");
    } //would determine if a number is odd

    scanner.close();
  }
}
