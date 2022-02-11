public class Objective8Lab2 {
  public static void main(String[] args) {
    int sumTotal = 0;

    //For loop to increment the value of control with each iteration.
    for (int i = 0; i < 20; i++){
      //Create one variable to store the current sum total.
      sumTotal += (i + 1);
    } //Sums up the numbers 1 -> 20

    //Print the sums of the numbers 1 -> 20
    System.out.println(sumTotal);
  }
}
