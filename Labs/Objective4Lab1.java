import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //TODO prompt the user to get input for all of the String variables.
    System.out.println("What is your first name?");
    String fname = scanner.nextLine();

    System.out.println("What is your last name?");
    String lname = scanner.nextLine();

    System.out.println("What is your favorite animal?");
    String favoriteAnimal = scanner.nextLine();

    System.out.println("What is your favorite food?");
    String favoriteFood = scanner.nextLine();

    System.out.println("What is your favorite song?");
    String favoriteSong = scanner.nextLine();

    //TODO print the output formatted to look like the expected output using String concatenation.
    /*
      >> What is your first name?
      >> John
      >> What is your last name?
      >> Doe
      >> What is your favorite animal?
      >> Lemur
      >> What is your favorite food?
      >> Tacos
      >> What is your favorite song?
      >> Twinkle Twinkle Little star
      >> My name is John Doe.
      >> My favorite animal is the Lemur.
      >> My favorite food is Tacos.
      >> My favorite song is Twinkle Twinkle Little Star.
    */
    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
    scanner.close();
  }
}
