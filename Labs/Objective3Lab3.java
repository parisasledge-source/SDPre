public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third, num;

    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);
    num = first + second + third;
    /*
      Print out the three random numbers with their sum
    */
    System.out.println(first + " + " + second + " + " + third + " = " + num);

  }
}
