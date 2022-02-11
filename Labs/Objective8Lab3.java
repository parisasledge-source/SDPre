public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    //Write a for loop that will print the numbers 1-20
    for (int i = 0; i < 20; i++){
      //Start the counter from 1
      counter = i + 1;

      if(counter % 2 == 0){
      System.out.println(counter + " is even"); //Print the values is even.
      } //Determine if the number is even

      if(counter % 2 == 1){
      System.out.println(counter + " is odd"); //Print the values is odd.
      } //Determine if the number is odd

    }

  }
}
