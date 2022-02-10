public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

     do {

      if(counter % 2 == 0){
      System.out.println(counter + " is even"); //Print the values is even.
      } //Determine if the number is even

      if(counter % 2 == 1){
      System.out.println(counter + " is odd"); //Print the values is odd.
      } //Determine if the number is odd


      counter = counter + 1; //this makes count forward
    } while(counter <= 20);
  }
}
