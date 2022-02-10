public class Objective7Lab4 {
  public static void main(String[] args) {

  //Create two variables to store the current sum total and a counter.
  int counter = 0;
  int sumTotal = 0;

    //Write a while loop to execute 20 times.
    while(counter <= 20) {

      //Update the current sum by adding counter to sum with each iteration.
      sumTotal = sumTotal + counter;

      //Increment the value of counter with each iteration.
      counter = counter + 1;
    }

    //Print the sums of the numbers 1 -> 20
    System.out.println(sumTotal);
  }
}
