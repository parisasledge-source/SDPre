import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    //Take in the users age using input.nextInt()and store it in the age variable.
    age = input.nextInt();
    //Current year
    currentYear = 2022;
    //Calculate what year the user was born in.
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
