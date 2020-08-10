import java.io.*;
import java.util.*;

public class HelloRecurs{


  public static void main( String[] args ) {

    //PART 1A: prints out first tester program
    System.out.println("Hello World");

    //PART 2A: Testing factorial method w/o
    playFactorial();

    //PART 3A: Testing fibonaci method w/o
    playFibonacci();


  } //end main method




  //PART 2: method takes in one integer to factor
  public static int factorial ( int x ){
    if ( x <= 1 ){  //if x is negative,0, or 1, return 1
      return 1;
    } else {
      return x * factorial ( x - 1 ); //if x is 2 or greater, multiply x by the value of the new call of the method -1.
    }//end if statement
  } //end factorial method





  //PART 2A: String output of the factorial method
  public static void playFactorial(){

    Scanner input = new Scanner( System.in );
    System.out.println( "Enter the number you would like to factor" ); //input test integer
    int num = input.nextInt(); //store integer in variable
    System.out.println(factorial(num)); //call factorial with variable data and print the returned value

    System.out.println( "Would you like to try another number? y/n" ); //to allow for multiple tests, ask user if they want to try another value
    input.nextLine(); //clear the value in memory
    String restart = input.nextLine(); //store string data in variable
    System.out.println();

    if (restart.equals( "y" )){ //test variable to determine control flow output
      playFactorial(); //

    } else {
      System.out.println( "Thanks for playing" );
    }
  } //end playfactorial



  //PART 3: Fibonaci method that returns the nth # of a series of positive #s
  public static int fibonacci (int x ){  //takes in a positive integer as an actual parameter

    if (x <= 2) { //check to see that the integer is greater than 2, if not, return 1
      return 1;
    } else {
      return fibonacci( x - 1 ) + fibonacci( x - 2); //if x is 3 or greater, add the next two values of x -1,
    }
  } //end fibonacci method




  //PART 3A: String output of the fibonaci method
  public static void playFibonacci(){

    Scanner input = new Scanner( System.in );
    System.out.println( "\nEnter the number you would like to sequence?" ); //input test integer
    int num = input.nextInt(); //store integer in variable
    System.out.println(fibonacci(num)); //call fibonacci with variable data and print the returned value

    System.out.println( "Would you like to try another number? y/n" ); //to allow for multiple tests, ask user if they want to try another value
    input.nextLine(); //clear the value in memory
    String restart = input.nextLine(); //store string data in variable
    System.out.println();

    if (restart.equals( "y" )){ //test variable to determine control flow output
      playFibonacci(); //

    } else {
      System.out.println( "Thanks for playing" ); //end statement
    }
  } //end playFibonacci



  //PART 5: Ackerman Method (from pre-work)
  /**
  * Tests two integers and returns the value of the Akerman function
  *
  * @param m is the first length
  * @param n is the second length
  * @return value of the Ackermann function
  */


  public static int ack(int m, int n){

      if (m == 0){
        return n + 1;
      }
      if (m > 0 && n == 0){
        return ack(m - 1, 1);
      }
        return ack(m - 1, ack(m, n - 1));
  }



} //end class
